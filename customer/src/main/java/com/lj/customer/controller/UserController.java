package com.lj.customer.controller;

import com.lj.common.domin.User;
import com.lj.common.service.UserService;
import jdk.nashorn.internal.ir.annotations.Reference;

import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class UserController {
    @Resource   //注入的是本地spring容器中的对象
    @Reference() ///dubbo的注解  注入的是分布式中的远程服务对象，
    private UserService userService;
    @GetMapping("getUser")
    public User user(){

        return userService.findUser();
    }

   // @GetMapping("getAllUser")
    @RequestMapping(value = "getAllUser",method = RequestMethod.POST,produces = "application/json;charset=UTF-8")
    @ResponseBody
    public List<User> getAll(){
        return  userService.getAll();
    }
}
