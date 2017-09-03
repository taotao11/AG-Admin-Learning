package com.github.wxiaoqi.security.uc.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ace on 2017/9/3.
 */
@RestController
@RequestMapping("user")
public class UserRest {
    @RequestMapping("test")
    @ResponseBody
    public String test() throws InterruptedException {
        Thread.sleep(7000);
        return "test";
    }
}
