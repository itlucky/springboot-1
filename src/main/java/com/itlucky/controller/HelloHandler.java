package com.itlucky.controller;

import com.itlucky.entity.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: itlucky
 * @Date: 2020/1/8 9:52 下午
 * @Description: TODO
 * @Version: V1.0
 **/
@RestController
public class HelloHandler {

    @Value("${server.port}")
    private String port;

    @RequestMapping("/index")
    private String index(){
        return "Hello World ~";
    }

    @RequestMapping("port")
    private String port(){
        return "当前服务端口是：" + this.port;
    }

    @RequestMapping("user")
    private User user(){
        return new User(101,"jack","1001");
    }
}
