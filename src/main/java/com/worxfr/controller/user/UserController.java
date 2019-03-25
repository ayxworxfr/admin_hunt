package com.worxfr.controller.user;


import com.worxfr.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    IUserService userService;

    /**
     * 用户登录
     */
//    @PostMapping("/login")
    public String login() {
        return "test";
//        return ServerResponse.createBySuccess("success");
    }
}
