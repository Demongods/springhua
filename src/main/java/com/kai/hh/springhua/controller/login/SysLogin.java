package com.kai.hh.springhua.controller.login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 系统登录控制器
 * @author  kh.w
 *
 */
@Controller
public class SysLogin {
    @GetMapping("/logins")
    public String login(){
        return "login";
    }
}
