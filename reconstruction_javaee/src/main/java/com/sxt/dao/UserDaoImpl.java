package com.sxt.dao;

import com.sxt.domain.User;

public class UserDaoImpl implements UserDao {
    @Override
    public User queryUserById(Integer id) {
        User user = null;
        switch (id) {
            case 1:
                user = new User(1, "小明", "武汉");
                break;
            case 2:
                user = new User(2, "老张", "日本");
                break;
            case 3:
                user = new User(3, "老周", "深圳");
                break;
        }
        return user;
    }
}
