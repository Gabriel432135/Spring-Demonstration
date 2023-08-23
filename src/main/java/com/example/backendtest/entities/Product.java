package com.example.backendtest.entities;
import java.io.Serializable;

public class Product implements Serializable{
    private Long id;
    private String name;
    private Double price;

    private Category category;
    private static final long serialVersionUID = -968818342L;

    public Product(){}
    

    public Product(Long id, String name, Double price, Category category) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.category = category;
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

    public Double getPrice() {
        return this.price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Category getCategory() {
        return this.category;
    }

    public void setCategory(Category category) {
        if(this.getCategory()!=null){
            this.getCategory().getProducts().remove(this);
        }
        this.category = category;
        category.getProducts().add(this);
    }

    public Product id(Long id) {
        setId(id);
        return this;
    }

    public Product name(String name) {
        setName(name);
        return this;
    }

    public Product price(Double price) {
        setPrice(price);
        return this;
    }

    public Product category(Category category) {
        setCategory(category);
        return this;
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
        Product other = (Product) obj;
        if (id == null) {
        if (other.id != null) return false;
        } else if (!id.equals(other.id)) return false;
        return true;
    }
    

    
}
