package com.productservice.productservice.models;

import jdk.jfr.Category;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Product extends BaseModel {
    //private Long id;
    private String title;
    private String description;
    private int price;
    private String image;
    private Category category;

}
