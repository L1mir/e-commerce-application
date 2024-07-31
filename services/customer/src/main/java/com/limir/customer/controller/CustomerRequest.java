package com.limir.customer.controller;

import com.limir.customer.model.Address;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;

public record CustomerRequest(
        String id,
        @NotNull(message = "customer firstname is required!")
        String firstname,
        @NotNull(message = "customer lastname is required!")
        String lastname,
        @NotNull(message = "customer email is required!")
        @Email(message = "Customer email is not valid email address")
        String email,
        Address address
) {
}
