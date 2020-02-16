package com.hyperzsb.spring.security.springsecuritydemo1.repository;

import com.hyperzsb.spring.security.springsecuritydemo1.domain.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRoleRepository extends JpaRepository<UserRole, Long> {
    List<UserRole> findUserRolesByUserId(Long userId);
}
