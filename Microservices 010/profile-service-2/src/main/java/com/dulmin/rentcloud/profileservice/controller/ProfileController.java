package com.dulmin.rentcloud.profileservice.controller;

import com.dulmin.rentcloud.models.Customer;
import com.dulmin.rentcloud.profileservice.service.CustomerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/services")
public class ProfileController {

    @Autowired
    CustomerServiceImpl customerService;

    @RequestMapping(value = "customer", method = RequestMethod.POST)
    public Customer save(@RequestBody Customer customer){
        return customerService.save(customer);
    }

    @RequestMapping(value = "customers",method = RequestMethod.GET)
    public List<Customer> getAllCustomer(){
        return customerService.getAllCustomers();
    }

    @RequestMapping(value = "customer",method = RequestMethod.GET)
    public Customer getCustomer(@RequestParam(value = "profileid") int id){
        return customerService.getCustomer(id);
    }

}
