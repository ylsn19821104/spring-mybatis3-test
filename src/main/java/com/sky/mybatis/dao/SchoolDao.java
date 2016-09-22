package com.sky.mybatis.dao;

import com.sky.mybatis.entity.School;

/**
 * Created by hongxp on 2016/9/22.
 */
public interface SchoolDao {
    int insert(School school);

    int update(School school);

    School selectByPrimaryKey(Integer sid);

    void deleteByPrimaryKey(Integer id);
}
