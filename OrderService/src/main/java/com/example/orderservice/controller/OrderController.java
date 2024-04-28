package com.example.orderservice.controller;

import com.example.orderservice.entity.Order;
import com.example.orderservice.service.OrderService;
import com.example.orderservice.valueObject.ResponseValueObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/order")
public class OrderController {
    @Autowired
    private OrderService orderService;



    @GetMapping("/")
    public String getOrder() {
        return "Hello";
    }

    @PostMapping("/")
    public Order saveOrder(@RequestBody Order order) {
        return orderService.saveOrder(order);
    }

    @GetMapping("/{id}")
    public ResponseValueObject findOrderById(@PathVariable("id") String id) {
        return orderService.getUserWithDepartment(id);
    }
}




