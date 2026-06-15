package com.jvlcode.Shopsphere.entity;

import jakarta.persistence.*;

@Entity
public class OrderItem {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Integer quantity;
    private String image;
    private Double Price;
    @ManyToOne
    @JoinColumn(name="order_id")
    private Product product;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Double getPrice() {
        return Price;
    }

    public void setPrice(Double price) {
        Price = price;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public OrderItem() {
    }

    public OrderItem(String name, Integer quantity, String image, Double price, Product product) {
        this.name = name;
        this.quantity = quantity;
        this.image = image;
        Price = price;
        this.product = product;
    }


}
