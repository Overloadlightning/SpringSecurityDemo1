package com.hyperzsb.spring.security.springsecuritydemo1.service;

import com.hyperzsb.spring.security.springsecuritydemo1.domain.Permission;
import com.hyperzsb.spring.security.springsecuritydemo1.domain.Role;

import java.util.List;

public interface PermissionService {
    List<Permission> getPermissionsByRole(Role role);
}
