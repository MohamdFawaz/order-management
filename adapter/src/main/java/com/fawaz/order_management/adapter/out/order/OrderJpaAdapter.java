package com.fawaz.order_management.adapter.out.order;

import com.fawaz.order_management.adapter.out.order.repository.OrderRepository;
import com.fawaz.order_management.domain.model.order.OrderModel;
import com.fawaz.order_management.domain.port.jpa.order.OrderJpaPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


@Component
@RequiredArgsConstructor
public class OrderJpaAdapter implements OrderJpaPort {

    private final OrderRepository orderRepository;

    @Override
    public List<OrderModel> getAllOrders() {
        return new ArrayList<>();
    }

    @Override
    public OrderModel createOrder(OrderModel order) {
        return new OrderModel();
    }
}