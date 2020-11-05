package com.itheima.dao;

import java.util.Date;

public class Persion {
    private Integer id;
    private String name;
    private String address;
    private Date birthday;

    public Persion() {
        System.out.println("Persion对象被创建......");
    }

    public Persion(Integer id, String name, String address, Date birthday) {
        super();
        this.id = id;
        this.name = name;
        this.address = address;
        this.birthday = birthday;
        System.out.println("Person参数被调用4个");
    }

    public Persion(Integer id, String name, String address) {
        super();
        this.id = id;
        this.name = name;
        this.address = address;
        System.out.println("Person参数被调用3个");
    }

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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Persion{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", birthday=" + birthday +
                '}';
    }
}
