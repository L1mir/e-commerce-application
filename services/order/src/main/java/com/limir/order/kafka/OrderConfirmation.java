package com.limir.order.kafka;

import com.limir.order.model.CustomerResponse;
import com.limir.order.model.PaymentMethod;
import com.limir.order.model.PurchaseResponse;

import java.math.BigDecimal;
import java.util.List;

public record OrderConfirmation(
        String orderReference,
        BigDecimal totalAmount,
        PaymentMethod paymentMethod,
        CustomerResponse customerResponse,
        List<PurchaseResponse>  products
) {
}
