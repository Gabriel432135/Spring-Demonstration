package com.example.backendtest.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.example.backendtest.entities.Product;

@Component
public class ProductRepository {

    private Map<Long, Product> map = new HashMap<>();

    public void save (Product obj) {
        map.put(obj.getId(), obj);
    }

    public void save(Product... obj){
        for(Product cat: obj){
            map.put(cat.getId(), cat);
        }
    }

    public Product findById(Long id) {
        return map.get(id);
    }
    
    public List<Product> findAll() {
        return new ArrayList<Product>(map.values());
    }

}
