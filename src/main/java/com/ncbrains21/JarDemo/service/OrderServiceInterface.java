package com.ncbrains21.JarDemo.service;

import com.ncbrains21.JarDemo.entity.CustomerEntity;
import com.ncbrains21.JarDemo.entity.OrderEntity;

import java.sql.Date;
import java.util.List;

public interface OrderServiceInterface {
    public List<OrderEntity> getAllOrders();
    public OrderEntity findOrderByID(int orderId);
    public OrderEntity placeAnOrder(OrderEntity placeOrder);
    public OrderEntity removeAnOrder(int orderId);
}
