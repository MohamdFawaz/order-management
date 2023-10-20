package com.fawaz.order_management.adapter.in.order;

import com.fawaz.order_management.adapter.in.order.dto.OrderDetailDto;
import com.fawaz.order_management.domain.port.api.order.OrderServicePort;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
@RestController
@RequiredArgsConstructor
@Tag(name = "order", description = "Order operations")
@RequestMapping("orders")
public class OrderController {
    private final OrderServicePort orderServicePort;

    @Operation(summary = "List orders")
    @GetMapping
    public List<OrderDetailDto> getUserOrders() {
        return new ArrayList<>();
    }
}
