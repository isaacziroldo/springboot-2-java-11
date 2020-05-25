package com.example.webcourse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.webcourse.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
