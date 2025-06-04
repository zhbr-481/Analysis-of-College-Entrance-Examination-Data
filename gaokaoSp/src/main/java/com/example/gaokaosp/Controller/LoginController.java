package com.example.gaokaosp.Controller;

import com.example.gaokaosp.Common.Result;
import com.example.gaokaosp.Service.LoginService;
import com.example.gaokaosp.entity.user;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/Login")
public class LoginController {
    @Resource
    private LoginService loginService;

    @GetMapping("/Login1")
    public Result Login(user user){
        System.out.print(user);
        return Result.success(loginService.Login(user));
    }

}
