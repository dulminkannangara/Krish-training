package com.dulmin.rentcloud.profileservice.repository;


import com.dulmin.rentcloud.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Integer> {

}
