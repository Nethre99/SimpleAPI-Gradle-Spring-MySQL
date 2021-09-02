package com.ncbrains21.JarDemo.service.implementation;

import com.ncbrains21.JarDemo.entity.CustomerEntity;
import com.ncbrains21.JarDemo.entity.OrderEntity;
import com.ncbrains21.JarDemo.repository.OrderRepository;
import com.ncbrains21.JarDemo.service.OrderServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImplementation implements OrderServiceInterface {
    @Autowired
    private OrderRepository orderRepo;

    @Override
    public List<OrderEntity> getAllOrders() {
        return (List<OrderEntity>) orderRepo.findAll();
    }

    @Override
    public OrderEntity placeAnOrder(OrderEntity placeOrder) {
        return orderRepo.save(placeOrder);
    }

    @Override
    public OrderEntity removeAnOrder(int orderId) {
        OrderEntity deleteOrder = null;

        try{
            deleteOrder = orderRepo.findById(orderId).orElse(null);

            if(deleteOrder == null){
                System.out.println("Order not found..");
            }else {
                orderRepo.deleteById(orderId);
            }
        }catch (Exception e){
            System.out.println(e);
        }

        return deleteOrder;
    }

    @Override
    public OrderEntity findOrderByID(int orderId) {
        OrderEntity order = null;

        order = orderRepo.findById(orderId).orElse(null);
        if(order == null){
            System.out.println("Order Not Found");
        }

        return order;
    }
}
