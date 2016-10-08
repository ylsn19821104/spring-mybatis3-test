package com.sky.mybatis.mapper;

import com.sky.mybatis.entity.Address;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import java.util.TreeMap;

/**
 * Created by hongxp on 2016/9/30.
 */
public interface AddressMapper {
    @Select("select * from address where sid=#{sid}")
    @Results({@Result(id = true, column = "sid", property = "sid", jdbcType = JdbcType.BIGINT),
            @Result(column = "name", property = "name", jdbcType = JdbcType.VARCHAR)}
    )
    Address findById(Long sid);

    @Insert("insert into address(sid,name) values(#{sid},#{name})")
    @SelectKey(statement = "select nextval('SEQ_ADDRESS')", keyProperty = "sid", before = true, resultType = long.class)
    int insert(Address address);
}
