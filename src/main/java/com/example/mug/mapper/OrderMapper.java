package com.example.mug.mapper;

import com.example.mug.entity.Order;
import java.util.List;

public interface OrderMapper {
    List<Order> findAll();
    Order findById(Long orderId);
    void insert(Order order);
    void update(Order order);
    void delete(Long orderId);
}
