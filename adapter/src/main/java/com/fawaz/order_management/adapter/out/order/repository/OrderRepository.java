package com.fawaz.order_management.adapter.out.order.repository;

import com.fawaz.order_management.adapter.out.order.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Integer> {
}