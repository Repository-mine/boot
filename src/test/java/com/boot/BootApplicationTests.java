package com.boot;

import com.boot.dao.MyUserMapper;
import com.boot.pojo.SysUser;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BootApplicationTests {
    @Autowired
    private MyUserMapper mapper;

    @Test
    public void selectAllUser() {
        List<SysUser> sysUsers = mapper.selectAllUser();
        for (SysUser sysUser : sysUsers) {
            System.out.println(sysUser);
        }
    }


}
