package com.example.service;

import com.example.mapper.mapper;
import com.example.model.TestInfo;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TestService {

    private final mapper mapper;

    public UserService(UserMapper userMapper) {
        this.mapper = mapper;
    }

    public List<TestInfo> findAll() {
        return mapper.findAll();
    }
}
