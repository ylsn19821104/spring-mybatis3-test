package com.sky.mybatis.mapper;

import com.sky.mybatis.entity.Teacher;

/**
 * Created by hongxp on 2016/9/22.
 */
public interface TeacherMapper {
    void insert(Teacher teacher);

    Teacher selectByPrimaryKey(int id);
}
