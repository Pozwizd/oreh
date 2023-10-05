package com.m.roman.oreh.service;

import com.m.roman.oreh.entity.Product;
import org.springframework.data.domain.Slice;

import java.util.List;

public interface ProductService {
    // Пагинация на уровне интерфейса сервиса помощью Slice

    public Slice<Product> getAllProducts(int page, int size);

    public List<Product> getAllProducts();

    public void saveProduct(Product product);

    public void deleteProduct(int id);

    public void updateProduct(Product product);

    public Product getProduct(int id);
}

