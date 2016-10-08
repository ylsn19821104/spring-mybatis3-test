package com.sky.mybatis.mapper;

import com.sky.mybatis.entity.User;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import java.util.List;

/**
 * Created by hongxp on 2016/9/29.
 */

public interface UserMapper {
    @Insert("insert into user(id,name,created,summary) values(#{id},#{name},#{created},#{summary})")
    @SelectKey(keyProperty = "id", statement = "select NEXTVAL('SEQ_USER') ", resultType = int.class, before = true)
        //@Options(useGeneratedKeys = true, keyProperty = "id")
    int add(User user);

    @Select("select * from user where id=#{id}")
    @Results({@Result(id = true, column = "id", property = "id"), @Result(column = "name", property = "name", jdbcType = JdbcType.VARCHAR),
            @Result(column = "summary", property = "summary", jdbcType = JdbcType.VARCHAR),
            @Result(column = "created", property = "created", jdbcType = JdbcType.DATE)})
    User selectById(int id);

    @Select("select * from user ")
    @ResultMap("com.sky.mybatis.mapper.UserMapper.UserResultMap")
    List<User> findAll();

    @Select("select * from user where id=#{id}")
    @Results({@Result(id = true, column = "id", property = "id"), @Result(column = "name", property = "name", jdbcType = JdbcType.VARCHAR),
            @Result(column = "summary", property = "summary", jdbcType = JdbcType.VARCHAR),
            @Result(column = "created", property = "created", jdbcType = JdbcType.DATE),
            @Result(column = "add_sid", property = "address", one = @One(select = "com.sky.mybatis.mapper.AddressMapper.findById"))})
    User selectWithAddress(int id);
}
