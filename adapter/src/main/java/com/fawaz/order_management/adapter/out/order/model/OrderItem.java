package com.fawaz.order_management.adapter.out.order.model;


import com.fawaz.order_management.adapter.out.product.model.Product;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Setter
@Getter
@Table(name = "order_items")
public class OrderItem {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Integer id;

    private Integer quantity;

    @ManyToOne
    Order order;

    @ManyToOne
    Product product;


}
