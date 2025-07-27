package com.example.crudwithredis.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Data
@Document(collection = "products")
public class Product implements Serializable {

    @Id
    private String id;
    private String name;
    private double price;
    private String description;
    private String category;
    private int stock;
}
