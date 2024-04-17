package com.example.mug.entity;

import java.sql.Timestamp;

public class Users {
    private Long userId;
    private String name;
    private String phoneNumber;
    private String email;



    private String password;
    private Boolean isMember;
    private String socialLoginType;
    private Timestamp createdAt;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public Long getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public Boolean getMember() {
        return isMember;
    }

    public String getSocialLoginType() {
        return socialLoginType;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setMember(Boolean member) {
        isMember = member;
    }

    public void setSocialLoginType(String socialLoginType) {
        this.socialLoginType = socialLoginType;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }



    // Getters and Setters
}
