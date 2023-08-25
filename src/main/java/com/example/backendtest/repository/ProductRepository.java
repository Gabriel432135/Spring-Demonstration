package com.example.backendtest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.backendtest.entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{}

/*
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
*/
