package com.fawaz.order_management.adapter.out.product.mapper;

import com.fawaz.order_management.adapter.out.product.model.Product;
import com.fawaz.order_management.domain.model.product.ProductModel;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface ProductMapper {


    ProductModel map(Product product);

    List<ProductModel> map(List<Product> productList);
}