package com.hyperzsb.spring.security.springsecuritydemo1.service;

import com.hyperzsb.spring.security.springsecuritydemo1.domain.User;
import com.hyperzsb.spring.security.springsecuritydemo1.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User getUserByUserName(String userName) {
        return userRepository.findUserByUserName(userName);
    }

}
