package com.example.mug.mapper;

import com.example.mug.entity.Product;
import java.util.List;

public interface ProductMapper {
    List<Product> findAll();
    Product findById(Long productId);
    void insert(Product product);
    void update(Product product);
    void delete(Long productId);
}