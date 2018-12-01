package com.boot.dao;

import com.boot.pojo.SysUser;

import java.util.List;

public interface MyUserMapper {
    public List<SysUser> selectAllUser();
}
