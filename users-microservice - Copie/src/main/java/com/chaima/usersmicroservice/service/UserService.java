package com.chaima.usersmicroservice.service;

import com.chaima.usersmicroservice.entities.Role;
import com.chaima.usersmicroservice.entities.User;

public interface UserService {
User saveUser(User user);
User findUserByUsername (String username);
Role addRole(Role role);
User addRoleToUser(String username, String rolename);
}