package com.sky.mybatis.mapper;

import com.sky.mybatis.entity.Grade;

import java.util.Set;

/**
 * Created by hongxp on 2016/9/22.
 */
public interface GradeMapper {
    Set<Grade> getGradesByTchId(int tchId);
}
