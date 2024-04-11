package com.example.mug.controller;

import com.example.mug.entity.TestInfo;
import com.example.mug.service.TestService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/testinfo")
public class TestInfoController {
    private final TestService testService;

    public TestInfoController(TestService testService) {
        this.testService = testService;
    }

    @GetMapping
    public List<TestInfo> findAll() {
        return testService.findAll();
    }
}
