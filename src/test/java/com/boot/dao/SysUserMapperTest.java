package com.boot.dao;

import com.boot.pojo.SysUser;
import com.boot.pojo.SysUserExample;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SysUserMapperTest {
    @Autowired
    private SysUserMapper mapper;

    @Test
    public void selectByPrimaryKey() {
        SysUser sysUser = mapper.selectByPrimaryKey("1001");
        System.out.println(sysUser);
    }

    @Test
    public void countByExample() {
    }

    @Test
    public void deleteByExample() {
    }

    @Test
    public void deleteByPrimaryKey() {
    }

    @Test
    public void insert() {
    }

    @Test
    public void insertSelective() {
    }

    @Test
    public void selectByExample() {
        List<SysUser> sysUsers = mapper.selectByExample(new SysUserExample());
        System.out.println(sysUsers);
    }

    @Test
    public void selectByPrimaryKey1() {
    }

    @Test
    @Transactional(propagation = Propagation.REQUIRED)
    public void updateByExampleSelective() {
        SysUser sysUser = new SysUser();
        sysUser.setUsername("ttt");
        mapper.updateByPrimaryKey(sysUser);
//        int i = 1 / 0;
    }

    @Test
    public void updateByExample() {
    }

    @Test
    public void updateByPrimaryKeySelective() {
    }

    @Test
    public void updateByPrimaryKey() {
    }
}