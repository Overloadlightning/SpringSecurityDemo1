package com.hyperzsb.spring.security.springsecuritydemo1.repository;

import com.hyperzsb.spring.security.springsecuritydemo1.domain.Permission;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PermissionRepository extends JpaRepository<Permission, Long> {
    Permission findPermissionById(Long id);
}
