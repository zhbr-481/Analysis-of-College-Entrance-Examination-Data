package com.example.gaokaosp.Controller;

import com.example.gaokaosp.Common.Result;
import com.example.gaokaosp.Service.SchoolService;
import com.example.gaokaosp.entity.Params;
import com.example.gaokaosp.entity.school;
import com.example.gaokaosp.entity.table;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/zhaosheng")
public class GaokaoController {
    @Resource
    private SchoolService schoolService;


    @GetMapping("/school")
    public Result getSchool(Params params){
        PageInfo<school> info = schoolService.getSchool(params);
        return Result.success(info);
    }

    @GetMapping("/findByName")
    public Result findSchoolByname(Params params){
        PageInfo<school> info = schoolService.findSchoolByname(params);
        return Result.success(info);
    }

    @GetMapping("/getscores24")
    public Result getscores24(Params params){

        PageInfo<table> info = schoolService.getscores24(params);
        return Result.success(info);
    }

    @GetMapping("/getscores23")
    public Result getscores23(Params params){

        PageInfo<table> info = schoolService.getscores23(params);
        return Result.success(info);
    }

    @GetMapping("/getscores22")
    public Result getscores22(Params params){

        PageInfo<table> info = schoolService.getscores22(params);
        return Result.success(info);
    }

    @GetMapping("/getscores21")
    public Result getscores21(Params params){

        PageInfo<table> info = schoolService.getscores21(params);
        return Result.success(info);
    }

    @GetMapping("/getscores20")
    public Result getscores20(Params params){

        PageInfo<table> info = schoolService.getscores20(params);
        return Result.success(info);
    }



}
