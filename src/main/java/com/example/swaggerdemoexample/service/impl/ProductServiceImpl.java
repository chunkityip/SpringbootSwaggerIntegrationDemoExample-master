package com.example.swaggerdemoexample.service.impl;


import com.example.swaggerdemoexample.entity.Product;
import com.example.swaggerdemoexample.repository.ProductRepo;
import com.example.swaggerdemoexample.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductServiceImpl implements ProductService {
   @Autowired
    private ProductRepo productRepo;

    @Override
    public List<Product> getAllProducts() {
        return productRepo.findAll();
    }

    @Override
    public Product insertProductIntoDatabase(Product product) {
        return productRepo.save(product);
    }
    @Override
    public Product getProductById(int id ) {
        return productRepo.findById(id).get();
    }

    @Override
    public Product updateProduct(Product product, int id) {
        Product oldProduct = productRepo.findById(id).get();
        oldProduct.setName(product.getName());
        oldProduct.setPrice(product.getPrice());
        oldProduct.setQuantity(product.getQuantity());
        productRepo.save(oldProduct);
        return oldProduct;
    }

    @Override
    public Product deleteProduct(int id) {
        Product p   = productRepo.findById(id).get();
        productRepo.deleteById(id);
        return p;
    }
}
