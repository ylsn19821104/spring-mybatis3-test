package com.sky.mybatis.entity;

import org.apache.commons.lang.builder.ToStringBuilder;

import java.util.Date;

/**
 * Created by hongxp on 2016/9/29.
 */
public class User {
    private int id;
    private Date created;
    private String name;
    private String summary;

    private Address address;

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("id", id)
                .append("created", created)
                .append("name", name)
                .append("summary", summary)
                .append("address", address)
                .toString();
    }

}
