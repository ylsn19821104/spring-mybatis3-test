package com.sky.mybatis.dao.impl;

import com.sky.mybatis.dao.SchoolDao;
import com.sky.mybatis.entity.School;
import com.sky.mybatis.mapper.SchoolMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


/**
 * Created by hongxp on 2016/9/22.
 */
@Repository("schoolDao")
public class SchoolDaoImpl implements SchoolDao {
    @Autowired
    private SchoolMapper schoolMapper;

    public int insert(School school) {
        return schoolMapper.insert(school);
    }

    public int update(School school) {
        return schoolMapper.update(school);
    }

    public School selectByPrimaryKey(Integer id) {
        return schoolMapper.selectByPrimaryKey(id);
    }

    public void deleteByPrimaryKey(Integer id) {
        schoolMapper.deleteByPrimaryKey(id);
    }
}
