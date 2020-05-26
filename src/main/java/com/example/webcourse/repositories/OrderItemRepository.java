package com.example.webcourse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.webcourse.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
