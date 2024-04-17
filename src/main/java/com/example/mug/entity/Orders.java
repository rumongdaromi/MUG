package com.example.mug.entity;

import java.sql.Timestamp;
import java.util.Date;

public class Orders {
    public Long getOrderId() {
        return orderId;
    }

    public Long getUserId() {
        return userId;
    }

    public Long getProductId() {
        return productId;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    private Long orderId;
    private Long userId;
    private Long productId;
    private Date orderDate;
    private Integer quantity;
    private String orderStatus;
    private Timestamp createdAt;

    // Getters and Setters
}


