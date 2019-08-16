package com.nine.department.service.admin;

import com.nine.department.entity.User;

import java.util.List;

public interface AdminService<T> {

    //查询所有用户
    List<User> findAllUser();

    //根据id查询用户
    List<T> findUserById(Long id);

    //添加用户
    int addUser(T t);

    //删除用户
    int delUser(String id);

    //修改用户信息
    void updateUser(T t);
}
