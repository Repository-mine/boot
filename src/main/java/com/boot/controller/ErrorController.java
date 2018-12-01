package com.boot.controller;

import com.boot.utils.JSONResult;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("err")
public class ErrorController {

    @RequestMapping("/error")
    public String error() {

        int a = 1 / 0;

        return "thymeleaf/index";
    }

    @RequestMapping("/ajaxerror")
    public String ajaxerror() {

        return "thymeleaf/ajaxerror";
    }

    @RequestMapping("/getAjaxerror")
    @ResponseBody
    public JSONResult getAjaxerror() {

        System.out.println("error:1/0");
        int a = 1 / 0;
        return JSONResult.errorException("123");
    }
}