package com.example.swaggerdemoexample.entity;


import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "Product")
@Schema(
        description = "this is the product entity"
)

public class Product {

    @Id
    private int id ;



    private String name;

    private Double price;

    private int quantity;
}
