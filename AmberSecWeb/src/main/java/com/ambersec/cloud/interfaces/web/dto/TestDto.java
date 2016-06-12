package com.ambersec.cloud.interfaces.web.dto;

import java.util.Date;

/**
 * Created by pine on 2016/6/3.
 */
public class TestDto implements Cloneable{
    private String name;
    private int age;
    private Date birthday;
    private TestDto subDto;

    public TestDto(String name, int age, Date birthday) {
        this.name = name;
        this.age = age;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public TestDto getSubDto() {
        return subDto;
    }

    public void setSubDto(TestDto subDto) {
        this.subDto = subDto;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
