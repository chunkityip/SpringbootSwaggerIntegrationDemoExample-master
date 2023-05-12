package com.example.swaggerdemoexample.repository;


import com.example.swaggerdemoexample.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<Product,Integer> {
}
