package com.hyperzsb.spring.security.springsecuritydemo1.service;

import com.hyperzsb.spring.security.springsecuritydemo1.domain.Role;
import com.hyperzsb.spring.security.springsecuritydemo1.domain.User;

import java.util.List;

public interface RoleService {
    List<Role> getRoles();
    List<Role> getRolesByUser(User user);
}
