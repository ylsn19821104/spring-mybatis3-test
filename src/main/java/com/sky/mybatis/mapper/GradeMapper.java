package com.sky.mybatis.mapper;

import com.sky.mybatis.entity.Grade;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Set;

/**
 * Created by hongxp on 2016/9/22.
 */
public interface GradeMapper {
    Grade selectById(int id);

    Set<Grade> getGradesByTchId(int tchId);

    List<Grade> findByPage(@Param("sort") String sort, @Param("dir") String dir, @Param("start") String start, @Param("limit") String limit);
}
