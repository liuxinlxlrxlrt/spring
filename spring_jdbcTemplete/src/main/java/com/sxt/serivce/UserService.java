package com.sxt.serivce;

import com.sxt.domain.User;

import java.util.List;

public interface UserService {
    int add(User user);
    int update(User user);
    int delete(Integer id);
    Long queryCount();
    User queryById(Integer id);
    List<User> queryAll();
    List<User> queryForPage(int currentPage,int pageSize);
}
