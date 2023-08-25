package com.example.backendtest.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Category implements Serializable{

    private static final long serialVersionUID = -689422690L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String name;

    @JsonIgnore
    @OneToMany(mappedBy = "category")
    private List<Product> products = new ArrayList<>();

    public Category(){}

    public Category(Long id, String name){
        super();
        this.id = id;
        this.name = name;
    }    


    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Product> getProducts() {
        return this.products;
    }

    @Override
    public int hashCode() { 
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id  == null) ? 0 : id. hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        Category other = (Category) obj;
        if (id == null) {
        if (other.id != null) return false;
        } else if (!id.equals(other.id)) return false;
        return true;
    }
    


}
