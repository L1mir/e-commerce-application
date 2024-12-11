package com.limir.customer.service;

import com.limir.customer.model.CustomerRequest;
import com.limir.customer.model.CustomerResponse;
import com.limir.customer.model.Customer;
import org.springframework.stereotype.Service;

@Service
public class CustomerMapper {

    public Customer toCustomer(CustomerRequest customerRequest) {
        if (customerRequest == null) {
            return null;
        }
        return Customer
                .builder()
                .id(customerRequest.id())
                .email(customerRequest.email())
                .firstname(customerRequest.firstname())
                .lastname(customerRequest.lastname())
                .address(customerRequest.address())
                .build();
    }

    public CustomerResponse fromCustomer(Customer customer) {
        return new CustomerResponse(
                customer.getId(),
                customer.getFirstname(),
                customer.getLastname(),
                customer.getEmail(),
                customer.getAddress()
        );
    }
}
