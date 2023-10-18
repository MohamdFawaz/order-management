package com.fawaz.order_management.domain.model.product;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

import static java.util.Objects.nonNull;

@Data
@NoArgsConstructor
public class ProductModel {


    private Integer id;
    private String name;
    private Integer price;

    public ProductModel(Integer id) {
        this.id = id;
    }
}