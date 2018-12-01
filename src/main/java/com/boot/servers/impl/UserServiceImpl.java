package com.boot.servers.impl;

import com.boot.dao.UserMapper;
import com.boot.pojo.User;
import com.boot.servers.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public User select(int id) {
        return userMapper.select(id);
    }

    @Override
//    @Transactional(rollbackFor = {Exception.class})
    @Transactional
    public int delete() throws Exception {
        int delete = userMapper.delete(10);
        System.out.println(delete);
//        throw new SQLException("发生异常了..");
        return delete;
    }

    @Override
    public int update(User user) {
        return userMapper.update(user);
    }

    @Override
    public int add(User user) {
        return userMapper.insert(user);
    }
}
