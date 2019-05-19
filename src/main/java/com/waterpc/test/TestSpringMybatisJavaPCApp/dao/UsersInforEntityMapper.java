package com.waterpc.test.TestSpringMybatisJavaPCApp.dao;

import com.waterpc.test.TestSpringMybatisJavaPCApp.entity.UsersInforEntity;

public interface UsersInforEntityMapper {
    int deleteByPrimaryKey(Long id);

    int insert(UsersInforEntity record);

    int insertSelective(UsersInforEntity record);

    UsersInforEntity selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UsersInforEntity record);

    int updateByPrimaryKey(UsersInforEntity record);
}