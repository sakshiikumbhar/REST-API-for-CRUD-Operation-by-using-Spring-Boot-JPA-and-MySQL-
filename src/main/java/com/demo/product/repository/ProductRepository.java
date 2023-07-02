package com.demo.product.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.product.entity.Product;

public interface ProductRepository extends JpaRepository<Product,Integer> {

}
