package com.boot.controller;

import com.boot.pojo.User;
import com.boot.servers.UserService;
import com.boot.utils.JSONResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/select")
    @ResponseBody
    public JSONResult select() {
        return JSONResult.ok(userService.select(1));
    }

    @RequestMapping("/add")
    @ResponseBody
    public JSONResult add() {
        User user = new User();
        user.setDesc("123131");
        user.setName("张无忌");
        user.setBirthday(new Date());
        userService.add(user);
        return JSONResult.ok();
    }

    @RequestMapping("/delete")
    @ResponseBody
    public JSONResult delete(){
        try {
            userService.delete();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("哈哈哈哈哈");
        }
        return JSONResult.ok();
    }

    @RequestMapping("/update")
    @ResponseBody
    public JSONResult update() {
        User user = new User();
        return JSONResult.ok(userService.update(user));
    }

}
