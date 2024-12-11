package com.limir.order.model;

import java.math.BigDecimal;

public record PaymentRequest(
        BigDecimal amount,
        PaymentMethod paymentMethod,
        Integer orderID,
        String orderReference,
        CustomerResponse customer
) {
}
