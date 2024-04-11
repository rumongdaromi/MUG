package com.example.mug.mapper;

import com.example.mug.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    List<User> findAll();
    User findById(Long userId);
    void insert(User user);
    void update(User user);
    void delete(Long userId);
}