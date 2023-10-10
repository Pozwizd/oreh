package com.m.roman.oreh.service;

import com.m.roman.oreh.model.Product;
import org.springframework.data.domain.Page;

import java.util.List;

public interface ProductService {

    public Page<Product> getAllProducts(int page, int size);

    public List<Product> getAllProducts();

    public void saveProduct(Product product);

    public void deleteProduct(long id);

    public void updateProduct(Product product);

    public Product getProduct(long id);
}

