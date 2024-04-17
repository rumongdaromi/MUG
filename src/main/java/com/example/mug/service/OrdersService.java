package com.example.mug.service;

import com.example.mug.entity.Orders;
import com.example.mug.mapper.OrdersMapper;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class OrdersService {
    private final OrdersMapper ordersMapper;

    public OrdersService(OrdersMapper ordersMapper){
        this.ordersMapper = ordersMapper;
    }
    public List<Orders> findAllOrders(){
        return ordersMapper.findAllOrders();
    }
}



