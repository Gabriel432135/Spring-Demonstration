package com.example.backendtest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.backendtest.entities.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long>{}

/*
@Component
public class CategoryRepository {

    private Map<Long, Category> map = new HashMap<>();

    public void save (Category obj) {
        map.put(obj.getId(), obj);
    }

    public void save(Category... obj){
        for(Category cat: obj){
            map.put(cat.getId(), cat);
        }
    }

    public Category findById(Long id) {
        return map.get(id);
    }
    
    public List<Category> findAll() {
        return new ArrayList<Category>(map.values());
    }
}
*/
