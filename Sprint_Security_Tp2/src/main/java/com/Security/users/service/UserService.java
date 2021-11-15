package com.Security.users.service;

import com.Security.users.entities.Role;
import com.Security.users.entities.User;

public interface UserService {
User saveUser(User user);
User findUserByUsername (String username);
Role addRole(Role role);
User addRoleToUser(String username, String rolename);
}