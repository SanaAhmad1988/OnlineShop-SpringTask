package com.OnlineShopping;


import java.util.ArrayList;
import java.util.List;

public class Order {
    private String id;
    private List<Product> products;

    public Order(String id) {
        this.id = id;
        this.products = new ArrayList<>();
    }

    // Add Product to Order
    public void addProduct(Product product) {
        products.add(product);
    }

    // Remove Product from Order
    public void removeProduct(Product product) {
        products.remove(product);
    }

    // Get Total Price
    public double getTotalPrice() {
        return products.stream().mapToDouble(Product::getPrice).sum();
    }

    // Getters and Setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    public List<Product> getProducts() { return products; }
    public void setProducts(List<Product> products) { this.products = products; }

    @Override
    public String toString() {
        return "Order{" + "id='" + id + '\'' + ", products=" + products + '}';
    }
}
