package com.example.webcourse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.webcourse.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
