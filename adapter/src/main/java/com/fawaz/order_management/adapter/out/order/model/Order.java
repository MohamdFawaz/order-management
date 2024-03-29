package com.fawaz.order_management.adapter.out.order.model;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Setter
@Getter
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Integer id;

    private Integer totalAmount;

    private LocalDateTime createdAt;

    @OneToMany
    List<OrderItem> orderItems;


}
