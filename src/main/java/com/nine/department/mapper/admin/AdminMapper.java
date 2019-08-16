package com.nine.department.mapper.admin;

import com.nine.department.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AdminMapper {
    public List<User> findAll();

    public int addUser(User user);

    public int delUser(long id);
}
