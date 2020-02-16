package com.hyperzsb.spring.security.springsecuritydemo1.repository;

import com.hyperzsb.spring.security.springsecuritydemo1.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findUserByUserName(String userName);
}
