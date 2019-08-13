package com.nine.department.service;

import org.springframework.stereotype.Service;

import java.util.List;

public interface BaseService<T> {

    //查询所有用户
    List<T> findAllUser();

    //根据id查询用户
    List<T> findUserById(Long id);

    //添加用户
    void addUser(T t);

    //删除用户
    void deleteUser(Long... ids);

    //修改用户信息
    void updateUser(T t);
}
