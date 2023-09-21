package com.m.roman.oreh.service.serviceImp;

import com.m.roman.oreh.entity.Product;
import com.m.roman.oreh.repository.ProductRepository;
import com.m.roman.oreh.service.ProductService;

import java.util.Optional;

public class ProductServiceImp implements ProductService {

    private final ProductRepository productRepository;

    public ProductServiceImp(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }


    @Override
    public Product getProduct(int id) {
        Optional<Product> product = productRepository.findById(id);
        return product.orElse(null);
    }
}
