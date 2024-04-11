package com.example.mug.service;

import com.example.mug.mapper.TestInfoMapper;
import com.example.mug.entity.TestInfo;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TestService {
    private final TestInfoMapper testInfoMapper;

    public TestService(TestInfoMapper testInfoMapper) {
        this.testInfoMapper = testInfoMapper;
    }

    public List<TestInfo> findAll() {
        return testInfoMapper.findAll();
    }
}
