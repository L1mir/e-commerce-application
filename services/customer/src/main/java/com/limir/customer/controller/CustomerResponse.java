package com.limir.customer.controller;

import com.limir.customer.model.Address;

public record CustomerResponse(
        String id,
        String firstname,
        String lastname,
        String email,
        Address address
) {
}
