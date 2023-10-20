package com.fawaz.order_management.adapter.out.product.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Setter
@Getter
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Integer id;

    private String name;

    private Integer price;

}
