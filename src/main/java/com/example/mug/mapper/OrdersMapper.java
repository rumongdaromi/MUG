package com.example.mug.mapper;

import com.example.mug.entity.Orders;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface OrdersMapper {
    @Select("SELECT * FROM Orders")
    List<Orders> findAllOrders();
}

