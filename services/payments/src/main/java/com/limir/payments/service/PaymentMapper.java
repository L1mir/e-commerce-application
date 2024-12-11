package com.limir.payments.service;


import com.limir.payments.model.Payment;
import com.limir.payments.model.PaymentRequest;
import org.springframework.stereotype.Service;

@Service
public class PaymentMapper {

    public Payment toPayment(PaymentRequest paymentRequest) {
        return Payment.builder()
                .id(paymentRequest.id())
                .paymentMethod(paymentRequest.paymentMethod())
                .amount(paymentRequest.amount())
                .orderId(paymentRequest.orderID())
                .build();
    }
}
