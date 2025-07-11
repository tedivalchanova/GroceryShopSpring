
package com.shop.model;

import jakarta.persistence.*;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private double price;
    private int quantity;
    private int x;
    private int y;

    public Product() {}
    public Product(String name, double price, int quantity, int x, int y) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.x = x;
        this.y = y;
    }

    // Getters and setters
    public Long getId() { return id; }
    public String getName() { return name; }
    public double getPrice() { return price; }
    public int getQuantity() { return quantity; }
    public int getX() { return x; }
    public int getY() { return y; }

    public void setId(Long id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setPrice(double price) { this.price = price; }
    public void setQuantity(int quantity) { this.quantity = quantity; }
    public void setX(int x) { this.x = x; }
    public void setY(int y) { this.y = y; }
}
