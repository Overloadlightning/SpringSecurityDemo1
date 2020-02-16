package com.hyperzsb.spring.security.springsecuritydemo1.repository;

import com.hyperzsb.spring.security.springsecuritydemo1.domain.RolePermission;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RolePermissionRepository extends JpaRepository<RolePermission, Long> {
    List<RolePermission> findRolePermissionsByRoleId(Long roleId);
}