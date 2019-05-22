package com.lzhui.crowdfunding.manager.service.impl;

import com.lzhui.crowdfunding.bean.User;
import com.lzhui.crowdfunding.manager.dao.UserMapper;
import com.lzhui.crowdfunding.manager.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.lzhui.crowdfunding.exception.LoginFailExecption;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public User querylogin(Map<String, Object> paramMap) {
       User user= userMapper.queryUserlogin(paramMap);
       if(user==null)
       {
           throw new LoginFailExecption("用户名或密码错误");
       }
        return user;
    }
}
