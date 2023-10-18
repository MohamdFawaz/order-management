package com.fawaz.order_management.adapter.in.order.mapper;


import com.fawaz.order_management.adapter.in.order.dto.OrderDetailDto;
import com.fawaz.order_management.domain.model.order.OrderModel;
import org.mapstruct.Mapping;

import java.util.List;

import static org.mapstruct.factory.Mappers.getMapper;

public interface OrderMapper {


    OrderDetailDto map(OrderModel orderModel);
    List<OrderDetailDto> map(List<OrderModel> orderModel);

    List<OrderDetailDto> toDtoList(List<OrderModel> orderModels);

}