package com.ssm.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ssm.pojo.User;
import com.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {
@Autowired
private UserService userService;
    @RequestMapping("/user2222222")
    @ResponseBody
    public Object run(@RequestParam(defaultValue = "1") Integer currentPage,@RequestParam(defaultValue = "5") Integer pageSize){
        PageHelper.startPage(currentPage,pageSize);
        List<User> users = userService.userList();
        System.out.println(users);
        PageInfo<User> userPageInfo=new PageInfo<>(users,3);
        return  users;
    }
}
