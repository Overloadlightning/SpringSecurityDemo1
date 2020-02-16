package com.hyperzsb.spring.security.springsecuritydemo1.service;

import com.hyperzsb.spring.security.springsecuritydemo1.domain.User;

public interface UserService {
    User getUserByUserName(String userName);
}
