package com.jvlcode.Shopsphere.controller;

import com.jvlcode.Shopsphere.dto.CreateOrderRequest;
import com.jvlcode.Shopsphere.dto.OrderCreated;
import com.jvlcode.Shopsphere.entity.Order;
import com.jvlcode.Shopsphere.service.OrderService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/orders")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping
    public ResponseEntity<?> createOrder(@RequestBody CreateOrderRequest orderRequest){
        OrderCreated orderCreated =orderService.createOrder(orderRequest);
        return ResponseEntity.ok().body(orderCreated);
    }

    @GetMapping("/{referenceId}")
    public ResponseEntity<?> getOrder(@PathVariable String referenceId){
        Order order= orderService.getOrder(referenceId);
        return ResponseEntity.ok().body(order);

    }

}
