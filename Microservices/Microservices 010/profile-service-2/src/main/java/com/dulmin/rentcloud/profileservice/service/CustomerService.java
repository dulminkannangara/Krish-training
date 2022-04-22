package com.dulmin.rentcloud.profileservice.service;

import com.dulmin.rentcloud.models.Customer;

import java.util.List;

public interface CustomerService {

    Customer save(Customer customer);
    List<Customer> getAllCustomers();
    Customer getCustomer(int profileid);
}
