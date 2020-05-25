package com.example.webcourse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.webcourse.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
