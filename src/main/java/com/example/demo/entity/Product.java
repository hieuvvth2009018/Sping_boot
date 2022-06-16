package com.example.demo.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Product {
    private int id;
    private String name;
    private String slug;
    private String description;
    private String thumbnail;
    private String status;
}
