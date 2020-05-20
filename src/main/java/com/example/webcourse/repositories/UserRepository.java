package com.example.webcourse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.webcourse.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
