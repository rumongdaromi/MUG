package com.example.mug.service;

import com.example.mug.entity.Products;
import com.example.mug.mapper.ProductsMapper;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ProductsService {
    private final ProductsMapper productsMapper;

    public ProductsService(ProductsMapper productsMapper){
        this.productsMapper = productsMapper;
    }
    public List<Products> findAllProducts(){
        return productsMapper.findAllProducts();
    }


}





//@Service
//public class UsersService {
//
//    private final UsersMapper usersMapper;
//
//    public UsersService(UsersMapper usersMapper) {
//        this.usersMapper = usersMapper;
//    }
//
//    public List<Users> findAllUsers() {
//        return usersMapper.findAllUsers();
//    }
//}