package com.example.mug.mapper;

import com.example.mug.entity.TestInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface TestInfoMapper {
    @Select("SELECT * FROM testinfo")
    List<TestInfo> findAll();
}