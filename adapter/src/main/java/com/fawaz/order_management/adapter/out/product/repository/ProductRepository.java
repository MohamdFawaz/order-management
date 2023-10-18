package com.fawaz.order_management.adapter.out.product.repository;

import com.fawaz.order_management.adapter.out.product.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
}