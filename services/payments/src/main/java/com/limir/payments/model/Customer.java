package com.limir.payments.model;


import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;

public record Customer(
        String id,
        @NotNull(message = "Firstname is required!")
        String firstname,
        @NotNull(message = "Lastname is required!")
        String lastname,
        @Email(message = "Customer email not valid")
        @NotNull(message = "Email is required!")
        String email
) {
}
