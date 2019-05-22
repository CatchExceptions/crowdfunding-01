package com.lzhui.crowdfunding.manager.dao;

import com.lzhui.crowdfunding.bean.ProjectTag;


public interface ProjectTagMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ProjectTag record);

    int insertSelective(ProjectTag record);

    ProjectTag selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ProjectTag record);

    int updateByPrimaryKey(ProjectTag record);
}