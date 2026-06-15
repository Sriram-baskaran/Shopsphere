package com.jvlcode.Shopsphere.service;

import com.jvlcode.Shopsphere.dto.CreateOrderRequest;
import com.jvlcode.Shopsphere.dto.OrderCreated;
import com.jvlcode.Shopsphere.dto.OrderItemDto;
import com.jvlcode.Shopsphere.entity.Order;
import com.jvlcode.Shopsphere.entity.OrderItem;
import com.jvlcode.Shopsphere.entity.Product;
import com.jvlcode.Shopsphere.repository.OrderRepository;
import com.jvlcode.Shopsphere.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class OrderService {
    @Autowired
    private ProductRepository prodRepo;

    @Autowired
    private OrderRepository orderRepo;
    public OrderCreated createOrder(CreateOrderRequest orderRequest) {
        Order order = new Order();
        order.setStatus("PENDING");
        double totalItemsAmount=0;

        for (OrderItemDto item : orderRequest.getOrderItems()) {
            OrderItem orderItem = new OrderItem();
            orderItem.setPrice(item.getPrice());
            orderItem.setImage(item.getImage());
            orderItem.setQuantity(item.getQuantity());


            Product product = prodRepo.findById(item.getProductId()).orElseThrow(()-> new RuntimeException("Product not found"));
            orderItem.setProduct(null);
            totalItemsAmount += item.getPrice() * item.getQuantity();

            order.getOrderItems().add(orderItem);
        }

        order.setTotalItemsAmount(totalItemsAmount);

        double totalAmount=0;
        double taxAmount=10;
        totalAmount= totalItemsAmount * taxAmount;
        order.setTotalAmount(totalAmount);
        order.setTaxAmount(taxAmount);
        String refId = UUID.randomUUID().toString();
        order.setReferenceId(refId);
        orderRepo.save(order);
        return new OrderCreated(refId);
    }
    public Order getOrder(String referenceId){
        return orderRepo.findByReferenceId(referenceId).orElseThrow(()-> new RuntimeException("No order found with reference id"));
    }
}
