package com.bjpowernode.dao;

import com.bjpowernode.domain.SysUser;
import com.bjpowernode.service.UserService;

public interface UserDao {
    void insertUser(SysUser user);
}
