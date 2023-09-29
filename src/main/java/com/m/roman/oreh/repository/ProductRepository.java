package com.m.roman.oreh.repository;

import com.m.roman.oreh.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}