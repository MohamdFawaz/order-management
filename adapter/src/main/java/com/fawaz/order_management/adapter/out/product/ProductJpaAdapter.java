package com.fawaz.order_management.adapter.out.product;

import com.fawaz.order_management.adapter.out.product.repository.ProductRepository;
import com.fawaz.order_management.domain.model.product.ProductModel;
import com.fawaz.order_management.domain.port.jpa.product.ProductJpaPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


@Component
@RequiredArgsConstructor
public class ProductJpaAdapter implements ProductJpaPort {

    private final ProductRepository productRepository;


    @Override
    public List<ProductModel> getAllProducts() {
        return new ArrayList<>();
    }

    @Override
    public ProductModel getProduct(Integer productId) {
        return new ProductModel();
    }
}