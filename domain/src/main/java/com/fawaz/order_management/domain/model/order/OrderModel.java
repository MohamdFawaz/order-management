package com.fawaz.order_management.domain.model.order;

import com.fawaz.order_management.domain.model.product.ProductModel;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class OrderModel {

    private Integer orderId;
    private Integer amount;
    private LocalDateTime creationDate;
    private ProductModel product;
}