package com.limir.order.model;

public record OrderLineRequest(
        Integer id,
        Integer orderId,
        Integer productId,
        double quantity
    ) {
}
