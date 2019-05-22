package com.lzhui.crowdfunding.manager.service;

import com.lzhui.crowdfunding.bean.User;

import java.util.Map;

public interface UserService {
    User querylogin(Map<String, Object> paramMap);
}
