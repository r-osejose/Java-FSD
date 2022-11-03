package com.example.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.dao.ProductRepo;
import com.example.model.Product;

public class Productservice {    
    @Autowired
    
    ProductRepo repo;

   public List saveProducts(java.util.List<Product> product) {
        // TODO Auto-generated method stub
        return (List) repo.saveAll(product);
    }
   public java.util.List<Product> getProduct() {
        // TODO Auto-generated method stub
        return repo.findAll();
    }
}