package com.lzhui.crowdfunding.manager.dao;

import com.lzhui.crowdfunding.bean.User;


import java.util.Map;

public interface UserMapper {
    User selectByPrimaryKey(Integer id);

    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    User queryUserlogin(Map<String, Object> paramMap);
}