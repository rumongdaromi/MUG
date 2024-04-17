package com.example.mug.entity;

import java.sql.Timestamp;

public class Products {
    private Long productId;
    private String productCode;
    private String name;
    private String category;
    private String gender;
    private Double price;
    private String size;
    private String option1;
    private String option2;
    private Timestamp createdAt;
    public Long getProductId() {
        return productId;
    }

    public String getProductCode() {
        return productCode;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public String getGender() {
        return gender;
    }

    public Double getPrice() {
        return price;
    }

    public String getSize() {
        return size;
    }

    public String getOption1() {
        return option1;
    }

    public String getOption2() {
        return option2;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setOption1(String option1) {
        this.option1 = option1;
    }

    public void setOption2(String option2) {
        this.option2 = option2;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }



    // Getters and Setters
}

