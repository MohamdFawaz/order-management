package com.fawaz.order_management.adapter.out.order.model;


import com.fawaz.order_management.adapter.out.product.model.Product;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Setter
@Getter
public class Order {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Integer id;
    private Integer totalAmount;
    private LocalDateTime createdAt;
    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;


}
