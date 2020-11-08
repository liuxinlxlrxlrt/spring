package com.sxt.dao;

import com.sxt.domain.User;

public interface UserDao {
    User queryUserById(Integer id);
}
