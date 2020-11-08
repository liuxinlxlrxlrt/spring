package com.itheima.dao;

import java.util.*;

public class Animal {

    private List<String> stringList;
    private List<User01> user01List;

    private Set<String> strSet;
    private Set<User01> user01Set;

    private Map<String,String> strMap;
    private Map<String,User01> user01Map;


    private String[] strs;
    private User01[] user01s;


    private Properties properties;

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public String[] getStrs() {
        return strs;
    }

    public void setStrs(String[] strs) {
        this.strs = strs;
    }

    public User01[] getUser01s() {
        return user01s;
    }

    public void setUser01s(User01[] user01s) {
        this.user01s = user01s;
    }

    public Map<String, String> getStrMap() {
        return strMap;
    }

    public void setStrMap(Map<String, String> strMap) {
        this.strMap = strMap;
    }

    public Map<String, User01> getUser01Map() {
        return user01Map;
    }

    public void setUser01Map(Map<String, User01> user01Map) {
        this.user01Map = user01Map;
    }

    public Set<String> getStrSet() {
        return strSet;
    }

    public void setStrSet(Set<String> strSet) {
        this.strSet = strSet;
    }

    public Set<User01> getUser01Set() {
        return user01Set;
    }

    public void setUser01Set(Set<User01> user01Set) {
        this.user01Set = user01Set;
    }

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
                ", strSet=" + strSet +
                ", user01Set=" + user01Set +
                ", strMap=" + strMap +
                ", user01Map=" + user01Map +
                ", strs=" + Arrays.toString(strs) +
                ", user01s=" + Arrays.toString(user01s) +
                '}';
    }
}
