package com.nine.department.service.admin.Impl;

import com.nine.department.entity.User;
import com.nine.department.mapper.admin.AdminMapper;
import com.nine.department.service.admin.AdminService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminServiceImpl implements AdminService<User> {

    @Autowired
    private AdminMapper adminMapper;

    @Override
    public List<User> findAllUser() {

        return adminMapper.findAll();
    }

    @Override
    public List<User> findUserById(Long id) {
        return null;
    }

    @Override
    public int addUser(User user) {

        return adminMapper.addUser(user);
    }

    @Override
    public int delUser(String id) {

        long userId = Integer.parseInt(id);
        return adminMapper.delUser(userId);
    }

    @Override
    public void updateUser(User user) {

    }
}
