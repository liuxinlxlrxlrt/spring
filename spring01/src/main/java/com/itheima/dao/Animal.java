package com.itheima.dao;

import java.util.List;

public class Animal {

    private List<String> stringList;

    private List<User01> user01List;


    public List<String> getStringList() {
        return stringList;
    }

    public void setStringList(List<String> stringList) {
        this.stringList = stringList;
    }

    public List<User01> getUser01List() {
        return user01List;
    }

    public void setUser01List(List<User01> user01List) {
        this.user01List = user01List;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "stringList=" + stringList +
                ", user01List=" + user01List +
                '}';
    }
}
