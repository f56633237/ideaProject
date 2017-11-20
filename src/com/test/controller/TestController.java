package com.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {
    @RequestMapping(value = "test")
    @ResponseBody
    public String test(){
        System.out.println("123123123123");
        String c="a";
        String b="b";
        String e="c";
        String f="f";
        return "hell there";
    }
}
