package com.nine.department.service.impl;

import com.nine.department.entity.User;
import com.nine.department.mapper.UserMapper;
import com.nine.department.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> findAllUser() {
        return userMapper.findAll();
    }

    @Override
    public List<User> findUserById(Long id) {
        return null;
    }

    @Override
    public void addUser(User user) {

    }

    @Override
    public void deleteUser(Long... ids) {

    }

    @Override
    public void updateUser(User user) {

    }
}
