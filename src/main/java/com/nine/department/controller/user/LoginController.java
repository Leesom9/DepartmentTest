package com.nine.department.controller.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/dept")
public class LoginController {


    /***
     *
     * @param username
     * @param password
     * @param request
     * @return
     */
    @RequestMapping("/login")
    public String login(@RequestParam(value = "username") String username,
                        @RequestParam(value = "password") String password,
                        HttpServletRequest request){
        //
        System.out.println("用户（"+username+"）已登录"+"->>"+"密码（"+password+"）");



        return "main";
    }
}
