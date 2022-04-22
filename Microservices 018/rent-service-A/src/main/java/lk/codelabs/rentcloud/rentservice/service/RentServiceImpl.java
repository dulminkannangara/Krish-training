package lk.codelabs.rentcloud.rentservice.service;

//import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.HystrixCommand;
import com.netflix.hystrix.HystrixCommandGroupKey;
import lk.codelabs.rentcloud.model.customer.Customer;
import lk.codelabs.rentcloud.model.rent.Rent;
import lk.codelabs.rentcloud.model.vehicle.Vehicle;
import lk.codelabs.rentcloud.rentservice.hystrix.CommonHystrixCommand;
import lk.codelabs.rentcloud.rentservice.hystrix.VehicleCommand;
import lk.codelabs.rentcloud.rentservice.model.DetailResponse;
import lk.codelabs.rentcloud.rentservice.repository.RentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/**
 * @author Krishantha Dinesh
 * krishantha@krishantha.com
 * www.krishantha.com
 * twitter @krishantha
 * on 15-October-2019 06:33
 * @Project rentcloudmodel
 */
@Service
public class RentServiceImpl implements RentService {


    @Autowired
    RentRepository rentRepository;

    @Autowired
    HystrixCommand.Setter setter;



    @LoadBalanced
    @Bean
    RestTemplate getRestTemplate(RestTemplateBuilder builder) {
        return builder.build();
    }

    @Autowired
    RestTemplate restTemplate;


    @Override
    public Rent save(Rent customer) {
        return rentRepository.save(customer);
    }


    @Override
    public Rent findById(int id) {
        Optional<Rent> rent = rentRepository.findById(id);

        if (rent.isPresent())
            return rent.get();
        else
            return new Rent();

    }


    @Override
    public List<Rent> findAll() {
        return rentRepository.findAll();
    }

    @Override
//    @HystrixCommand(fallbackMethod = "findDetailResponseFallback")
    public DetailResponse findDetailResponse(int id) throws ExecutionException, InterruptedException{


        Rent rent = findById(id);
        Customer customer = getCustomer(rent.getCustomerId());
        Vehicle vehicle = getVehicle(rent.getVehicleId());

        return new DetailResponse(rent, customer, vehicle);


    }

//    public DetailResponse findDetailResponseFallback(int id) {
//        return new DetailResponse(new Rent(), new Customer(), new Vehicle());
//    }

    private Customer getCustomer(int customerId) throws ExecutionException, InterruptedException {

//        CommonHystrixCommand<Customer> customerCommonHystrixCommand = new CommonHystrixCommand<Customer>("default",
        CommonHystrixCommand<Customer> customerCommonHystrixCommand = new CommonHystrixCommand<Customer>(setter,
                () -> {
                    return restTemplate.getForObject("http://customer/services/customers/" + customerId, Customer.class);
                }, () -> {
                    return new Customer();
                 });

        Future<Customer> customerFuture = customerCommonHystrixCommand.queue();
        return  customerFuture.get();

//        Customer customer=restTemplate.getForObject("http://localhost:8080/services/customers/"+customerId,Customer.class);

//        Customer customer=restTemplate.getForObject("http://customer/services/customers/"+customerId,Customer.class);
        //~~~~~~~~~~~~~~ "customer" of the above link is the application name, which is put in bootstrap.yml  ~~~~~~~~~~~
//        return customer;

    }

    private Vehicle getVehicle(int vehicleId) {

        VehicleCommand vehicleCommand = new VehicleCommand(restTemplate, vehicleId);
        return vehicleCommand.execute();

//       return restTemplate.getForObject("http://vehicle/services/vehicles/"+vehicleId,Vehicle.class);


    }
}
