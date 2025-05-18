package org.example.homework2;

import java.util.HashMap;
import java.util.Map;

public class PriceList {
    private Map<String, Double> products = new HashMap<>();

    public void addProduct(String name, double price) {
        products.put(name, price);
    }

    public boolean updatePrice(String name, double newPrice) {
        if (products.containsKey(name)) {
            products.put(name, newPrice);
            return true;
        }
        return false;
    }

    public Double getPrice(String name) {
        return products.get(name);
    }

    public Map<String, Double> getAllProducts() {
        return new HashMap<>(products);
    }
}
