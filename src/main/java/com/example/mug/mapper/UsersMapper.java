package com.example.mug.mapper;

import com.example.mug.entity.Users;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import java.util.List;



@Mapper
public interface UsersMapper {
    void save(Users users);


    @Select("SELECT * FROM Users")
    List<Users> findAllUsers();

    @Select("SELECT * FROM Users WHERE username = #{username}")
    Users findByUsername(String username);


    @Insert("INSERT INTO Users (`이름`, `전화번호`, `이메일`, `회원여부`, `소셜로그인 타입`)\n" +
            "        VALUES (#{name}, #{phoneNumber}, #{email},#{password} ,#{isMember}, #{socialLoginType})")
    List<Users> insertUser();

    @Insert("INSERT INTO Users(username, password, enabled)\n" +
            "        VALUES (#{username}, #{password}, #{enabled})")
    List<Users> save();
}

