package com.nine.department.controller.admin;

import com.nine.department.entity.User;
import com.nine.department.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("findAllUser")
    public List<User> findAllUser(){

        return userService.findAllUser();
    }

    @GetMapping(value = {"/","/index"})
    public String index(){

        return "/home/index";
    }
}
