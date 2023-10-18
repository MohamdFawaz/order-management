package com.fawaz.order_management.adapter.out.order.mapper;

import com.fawaz.order_management.adapter.out.order.model.Order;
import com.fawaz.order_management.domain.model.order.OrderModel;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.time.LocalDateTime;
import java.util.List;

@Mapper(imports = LocalDateTime.class)
public interface OrderMapper {


    @Mapping(target = "createdAt", expression = "java(LocalDateTime.now())")
    Order map(OrderModel orderDomainModel);

    @Mapping(target = "product.name", ignore = true)
    @Mapping(target = "product.description", ignore = true)
    @Mapping(target = "orderId", source = "id")
    OrderModel map(Order orderEntity);

    List<OrderModel> map(List<Order> orderDomainModelList);
}