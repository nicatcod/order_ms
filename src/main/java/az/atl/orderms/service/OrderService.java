package az.atl.orderms.service;

import az.atl.orderms.model.request.OrderProductDto;
import az.atl.orderms.model.response.OrderResponseDto;

public interface OrderService {
    OrderResponseDto getOrderById (Long id);

    void oderProduct(OrderProductDto dto);
}