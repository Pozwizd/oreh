package com.m.roman.oreh.service;

import com.m.roman.oreh.entity.Product;

import java.util.List;

public interface ProductService {

    public List<Product> getAllProducts();

    public void saveProduct(Product product);

    public void deleteProduct(int id);

    public void updateProduct(Product product);

    public Product getProduct(int id);
}

