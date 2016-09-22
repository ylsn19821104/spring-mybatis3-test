package com.sky.mybatis.entity;

import org.apache.commons.lang.builder.ToStringBuilder;

/**
 * Created by hongxp on 2016/9/21.
 */
public class School {
    private Integer sid;
    private String name;

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("sid", sid)
                .append("name", name)
                .toString();
    }
}
