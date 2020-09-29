package com.lj.provider.service.impl;
import com.alibaba.dubbo.config.annotation.Service;
import com.lj.common.domin.User;
import com.lj.common.service.UserService;
import com.lj.provider.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


@Service
public class UserImpl implements UserService {
    @Autowired(required = false)
    private UserMapper userMapper;

   @Override
    public User findUser(){
       return userMapper.getOne(1);
       // return "hello i am dubbo";
    }

   @Override
    public List<User>  getAll(){
        return  userMapper.getAll();
    }

}
