package com.sky.mybatis.entity;

import org.apache.commons.lang.builder.ToStringBuilder;

/**
 * Created by hongxp on 2016/9/30.
 */
public class Address {
    private Long sid;
    private String name;

    public Long getSid() {
        return sid;
    }

    public void setSid(Long sid) {
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
