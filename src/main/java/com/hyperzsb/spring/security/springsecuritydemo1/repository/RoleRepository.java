package com.hyperzsb.spring.security.springsecuritydemo1.repository;

import com.hyperzsb.spring.security.springsecuritydemo1.domain.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findRoleById(Long id);
}
