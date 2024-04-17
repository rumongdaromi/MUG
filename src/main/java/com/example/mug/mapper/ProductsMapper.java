package com.example.mug.mapper;

import com.example.mug.entity.Products;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;


@Mapper
public interface ProductsMapper {
    @Select("SELECT * FROM Products")
    List<Products> findAllProducts();
}
