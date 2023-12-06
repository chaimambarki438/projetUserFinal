package com.chaima.usersmicroservice.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.chaima.usersmicroservice.entities.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
Role findByRole(String role);
}