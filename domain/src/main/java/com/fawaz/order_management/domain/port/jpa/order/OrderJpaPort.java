package com.fawaz.order_management.domain.port.jpa.order;

import com.fawaz.order_management.domain.model.order.OrderModel;

import java.util.List;

/**
 * Secondary port is used to manage orders on persistence level
 */
public interface OrderJpaPort {

    /**
     * Gets all created orders
     *
     * @return list of orders
     */
    List<OrderModel> getAllOrders();

    /**
     * Creates a new order
     *
     * @param order to be created
     * @return the newly created order
     */
    OrderModel createOrder(OrderModel order);
}