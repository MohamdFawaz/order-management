package com.fawaz.order_management.application.service.product;

import com.fawaz.order_management.domain.model.product.ProductModel;
import com.fawaz.order_management.domain.port.api.product.ProductPortService;
import com.fawaz.order_management.domain.port.jpa.product.ProductJpaPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductApplicationService implements ProductPortService {
    private final ProductJpaPort productJpaPort;

    @Override
    public List<ProductModel> getAllProducts() {
        return this.productJpaPort.getAllProducts();
    }

    @Override
    public ProductModel getProduct(Integer productId) {
        return this.productJpaPort.getProduct(productId);
    }
}
