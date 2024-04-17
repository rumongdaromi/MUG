package com.example.mug.service;

import com.example.mug.entity.Users;
import com.example.mug.mapper.UsersMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersService {

    private final UsersMapper usersMapper;
    private final PasswordEncoder passwordEncoder;

    @Autowired
    public UsersService(UsersMapper usersMapper, PasswordEncoder passwordEncoder) {
        this.usersMapper = usersMapper;
        this.passwordEncoder = passwordEncoder;
    }

    public List<Users> findAllUsers() {
        return usersMapper.findAllUsers();
    }

    public Users registerNewUserAccount(Users userDto) {
        Users user = new Users();
        user.setName(userDto.getName()); // username 대신 name을 사용합니다.
        user.setPassword(passwordEncoder.encode(userDto.getPassword()));
        user.setEmail(userDto.getEmail());
        user.setPhoneNumber(userDto.getPhoneNumber());
        user.setMember(true); // 예시로 모든 새 계정을 회원으로 설정합니다.
        user.setSocialLoginType(userDto.getSocialLoginType()); // 필요한 경우
        usersMapper.save(user);
        return user;
    }

    public Users findByUsername(String name) { // 메서드 명을 findByUsername에서 findByName으로 변경하는 것이 좋겠습니다.
        return usersMapper.findByUsername(name);
    }
}




//private final UsersMapper usersMapper;
//
//public UsersService(UsersMapper usersMapper) {
//    this.usersMapper = usersMapper;
//}
//
//public List<Users> findAllUsers() {
//    return usersMapper.findAllUsers();
//}