package com.productservice.productservice.services;

import org.springframework.stereotype.Service;

@Service
public class FakeStoreProductService implements ProductService {
    @Override
    public String getProductById(Long id) {
        return "i have a product with id: " + id;
    }

    @Override
    public void getAllProductById() {

    }

    @Override
    public void deleteProductById() {

    }

    @Override
    public void creatProductById() {

    }

    @Override
    public void updateProductById() {

    }
}
