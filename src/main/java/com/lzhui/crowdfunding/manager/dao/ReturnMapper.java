package com.lzhui.crowdfunding.manager.dao;

import com.lzhui.crowdfunding.bean.Return;


public interface ReturnMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Return record);

    int insertSelective(Return record);

    Return selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Return record);

    int updateByPrimaryKey(Return record);
}