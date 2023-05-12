package com.example.swaggerdemoexample.service;



import com.example.swaggerdemoexample.entity.Product;

import java.util.List;


public interface ProductService {

    List<Product> getAllProducts();

    Product insertProductIntoDatabase(Product product);

    Product getProductById(int id );

    Product updateProduct(Product product, int id);

    Product deleteProduct(int id);
}
