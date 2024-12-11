package com.limir.customer.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.limir.customer.model.Customer;

@Repository
public interface CustomerRepository extends MongoRepository<Customer, String> {

}
