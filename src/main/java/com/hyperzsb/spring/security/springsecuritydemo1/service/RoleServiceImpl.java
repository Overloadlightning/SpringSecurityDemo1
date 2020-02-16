package com.hyperzsb.spring.security.springsecuritydemo1.service;

import com.hyperzsb.spring.security.springsecuritydemo1.domain.Role;
import com.hyperzsb.spring.security.springsecuritydemo1.domain.User;
import com.hyperzsb.spring.security.springsecuritydemo1.domain.UserRole;
import com.hyperzsb.spring.security.springsecuritydemo1.repository.RoleRepository;
import com.hyperzsb.spring.security.springsecuritydemo1.repository.UserRoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class RoleServiceImpl implements RoleService {

    @Autowired
    private UserRoleRepository userRoleRepository;

    @Autowired
    private RoleRepository roleRepository;

    @Override
    public List<Role> getRoles() {
        return roleRepository.findAll();
    }

    @Override
    public List<Role> getRolesByUser(User user) {
        List<UserRole> userRoleList = userRoleRepository.findUserRolesByUserId(user.getId());
        List<Role> roleList = new ArrayList<>();
        for (UserRole userRole : userRoleList)
            roleList.add(roleRepository.findRoleById(userRole.getRoleId()));
        return roleList;
    }

}
