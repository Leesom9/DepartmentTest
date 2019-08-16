package com.nine.department.controller.admin;

import com.nine.department.entity.User;
import com.nine.department.service.admin.Impl.AdminServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class AdminController {
    @Autowired
    private AdminServiceImpl adminService;

    @RequestMapping("admin/findAllUser")
    public String findAllUser(Model model){
        List<User> userList = adminService.findAllUser();

        model.addAttribute("userList",userList);

        return "/home/admin/admin";
    }

    @GetMapping(value = {"/","/index"})
    public String index(){

        return "/home/index";
    }

    @GetMapping(value = "/admin")
    public String adminPage(){

        return "/home/admin/admin";
    }

    @ResponseBody
    @RequestMapping("/admin/addUser")
    public String addUser(
            @RequestParam("username") String username,
            @RequestParam("password") String password,
            Model model
    ){

        User user = new User();
        user.setUsername(username);
        user.setPassword(password);

        int addFlag = adminService.addUser(user);
        if(addFlag == 1){
            model.addAttribute("addUserResult","success");
        }else{
            model.addAttribute("addUserResult","error");
        }
        return "admin/findAllUser";
    }

    @RequestMapping("/admin/delUser/{id}")
    public int delUser(
            @PathVariable String id
    ){

        System.out.println("+++++++++++"+id);
        return adminService.delUser(id);
    }
}
