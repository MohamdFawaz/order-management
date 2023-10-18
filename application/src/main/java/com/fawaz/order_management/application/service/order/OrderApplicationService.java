package com.fawaz.order_management.application.service.order;

import com.fawaz.order_management.domain.model.order.OrderModel;
import com.fawaz.order_management.domain.port.api.order.OrderServicePort;
import com.fawaz.order_management.domain.port.jpa.order.OrderJpaPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OrderApplicationService implements OrderServicePort {

    private final OrderJpaPort orderJpaPort;


    @Override
    public List<OrderModel> getAllOrders() {
        return this.orderJpaPort.getAllOrders();
    }

    @Override
    @Transactional
    public OrderModel createNewOrder(OrderModel orderModel) {
        return this.orderJpaPort.createOrder(orderModel);
    }
}
