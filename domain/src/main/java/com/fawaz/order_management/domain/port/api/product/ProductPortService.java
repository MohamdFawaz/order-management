package com.fawaz.order_management.domain.port.api.product;

import com.fawaz.order_management.domain.model.product.ProductModel;

import java.util.List;

public interface ProductPortService {
    List<ProductModel> getAllProducts();

    ProductModel getProduct(Integer productId);
}
