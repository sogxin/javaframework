package com.bjpowernode.service.impl;

import com.bjpowernode.dao.UserDao;
import com.bjpowernode.dao.impl.UserDaoImpl;
import com.bjpowernode.domain.SysUser;
import com.bjpowernode.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("userService")
public class UserServiceImpl implements UserService {
    //可以不需要
    public void setDao(UserDao dao) {
        this.dao = dao;
    }
//   @Autowired
//   @Qualifier("mysqlDao")
    @Resource(name="oracleDao")
    private UserDao dao = null;
    @Override
    public void addUser(SysUser user){
        dao.insertUser(user);
    }

}
