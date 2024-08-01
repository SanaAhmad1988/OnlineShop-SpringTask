package com.OnlineShopping;


import java.util.HashMap;
import java.util.Map;

public class OrderService {
    private Map<String, Order> orderMap = new HashMap<>();

    public void createOrder(Order order) {
        orderMap.put(order.getId(), order);
    }

    public Order getOrder(String id) {
        return orderMap.get(id);
    }

    public void addProductToOrder(String orderId, Product product) {
        Order order = orderMap.get(orderId);
        if (order != null) {
            order.addProduct(product);
        }
    }

    public void removeProductFromOrder(String orderId, Product product) {
        Order order = orderMap.get(orderId);
        if (order != null) {
            order.removeProduct(product);
        }
    }

    public void deleteOrder(String id) {
        orderMap.remove(id);
    }
}
