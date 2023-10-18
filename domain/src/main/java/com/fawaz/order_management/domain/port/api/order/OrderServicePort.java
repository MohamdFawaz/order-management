package com.fawaz.order_management.domain.port.api.order;

import com.fawaz.order_management.domain.model.order.OrderModel;

import java.util.List;


public interface OrderServicePort {
    List<OrderModel> getAllOrders();

    OrderModel createNewOrder(OrderModel orderModel);
}
