package com.OnlineShopping;



import java.util.HashMap;
import java.util.Map;

public class ProductService {
    private Map<String, Product> productMap = new HashMap<>();

    public void createProduct(Product product) {
        productMap.put(product.getId(), product);
    }

    public Product getProduct(String id) {
        return productMap.get(id);
    }

    public void updateProduct(Product product) {
        productMap.put(product.getId(), product);
    }

    public void deleteProduct(String id) {
        productMap.remove(id);
    }
}
