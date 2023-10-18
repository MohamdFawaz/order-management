package com.fawaz.order_management.domain.port.jpa.product;

import com.fawaz.order_management.domain.model.product.ProductModel;

import java.util.List;

public interface ProductJpaPort {
    List<ProductModel> getAllProducts();

    ProductModel getProduct(Integer productId);
}
