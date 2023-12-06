package com.chaima.usersmicroservice.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.chaima.usersmicroservice.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
User findByUsername(String username);
}