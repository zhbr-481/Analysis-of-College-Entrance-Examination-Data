package com.example.gaokaosp.dao;

import com.example.gaokaosp.entity.user;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginDao {
    @Select("select username,password from user where username=#{username}")
    public user Login(user user);

}
