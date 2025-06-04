package com.example.gaokaosp.Service;
import com.example.gaokaosp.dao.GaokaoDao;
import com.example.gaokaosp.entity.Params;
import com.example.gaokaosp.entity.school;
import com.example.gaokaosp.entity.table;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.persistence.Table;
import java.util.List;

@Service
public class SchoolService {
    @Resource
    private GaokaoDao gaokaodao;

    public PageInfo<school> getSchool(Params params){
        PageHelper.startPage(params.getPageNum(), params.getPageSize());
        List<school> list = gaokaodao.getSchool(params);
        System.out.println(PageInfo.of(list));
        return PageInfo.of(list);

    }

    public PageInfo<school> findSchoolByname(Params params){
        PageHelper.startPage(params.getPageNum(), params.getPageSize());
        List<school> list = gaokaodao.findSchoolByname(params);
        System.out.println(PageInfo.of(list));
        return PageInfo.of(list);
    }

    public PageInfo<table> getscores24(Params params){
        PageHelper.startPage(params.getPageNum(), params.getPageSize());
        List<table> table24 = gaokaodao.getscores24();
        return PageInfo.of(table24);
    }

    public PageInfo<table> getscores23(Params params){
        PageHelper.startPage(params.getPageNum(), params.getPageSize());
        List<table> table23 = gaokaodao.getscores23();
        return PageInfo.of(table23);
    }

    public PageInfo<table> getscores22(Params params){
        PageHelper.startPage(params.getPageNum(), params.getPageSize());
        List<table> table22 = gaokaodao.getscores22();
        return PageInfo.of(table22);
    }

    public PageInfo<table> getscores21(Params params){
        PageHelper.startPage(params.getPageNum(), params.getPageSize());
        List<table> table21 = gaokaodao.getscores21();
        return PageInfo.of(table21);
    }

    public PageInfo<table> getscores20(Params params){
        PageHelper.startPage(params.getPageNum(), params.getPageSize());
        List<table> table20 = gaokaodao.getscores20();
        return PageInfo.of(table20);
    }

}
