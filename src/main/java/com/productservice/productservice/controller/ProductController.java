package com.productservice.productservice.controller;

import com.productservice.productservice.services.ProductService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products")

public class ProductController {

    private ProductService productService;
    ProductController(ProductService productService) {
        this.productService = productService;
    }
    @GetMapping("/{id}")
    public String getProductById(@PathVariable("id") Long id) {
        return productService.getProductById(id);

    }
    @GetMapping
    public void getAllProductById() {

    }
    @DeleteMapping("/{id}")
    public void deleteProductById() {

    }
   // @PutMapping("/{id}")
    public void creatProductById() {

    }
    //@PutMapping
    public void updateProductById() {

    }

}
