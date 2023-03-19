package com.ecomerce.nabil.service;

import com.ecomerce.nabil.dao.RoleDao;
import com.ecomerce.nabil.entity.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleService {

    @Autowired
    private RoleDao roleDao;

    public Role createNewRole(Role role) {
        return roleDao.save(role);
    }
}
