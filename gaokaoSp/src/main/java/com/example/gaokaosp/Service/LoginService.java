package com.example.gaokaosp.Service;

import com.example.gaokaosp.dao.LoginDao;
import com.example.gaokaosp.entity.user;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class LoginService {
    @Resource
    private LoginDao loginDao;

    public user Login(user user){
        return loginDao.Login(user);
    }

}
