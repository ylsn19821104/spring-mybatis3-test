package com.sky.mybatis.entity;

import org.apache.commons.lang.builder.ToStringBuilder;

import java.util.Date;
import java.util.Set;

/**
 * Created by hongxp on 2016/9/22.
 */
public class Teacher {
    private Integer id;
    private String name;
    private Date createDate;
    private School school;
    private Set<Grade> grades;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }

    public Set<Grade> getGrades() {
        return grades;
    }

    public void setGrades(Set<Grade> grades) {
        this.grades = grades;
    }

    public Teacher() {
    }

    public Teacher(String name, Date createDate, School school) {
        this.name = name;
        this.createDate = createDate;
        this.school = school;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("id", id)
                .append("name", name)
                .append("createDate", createDate)
                .append("school", school)
                .append("grades", grades)
                .toString();
    }
}
