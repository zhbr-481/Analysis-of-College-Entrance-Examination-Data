package com.example.gaokaosp.dao;

import com.example.gaokaosp.entity.Params;
import com.example.gaokaosp.entity.school;
import com.example.gaokaosp.entity.table;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

@Repository
public interface GaokaoDao extends Mapper<school> {

    @Select("select zslist, image,schoolname,location,type1,type2,type3,plan,majornum,kuozhao,id,guanwang from gaokaodata")
    public List<school> getSchool(Params params);

    @Select("select zslist, image,schoolname,location,type1,type2,type3,plan,majornum,kuozhao,id,guanwang from gaokaodata where schoolname LIKE CONCAT('%', #{findSchoolName}, '%')")
    public List<school> findSchoolByname(Params params);

    @Select("select score, thisNum ,totolNum ,wlthisNum ,wltotolNum, hxthisNum, hxtotolNum, swthisNum ,swtotolNum ,szthisNum ,sztotolNum, lsthisNum ,lstotolNum, dlthisNum, dltotolNum from table2024")
    public List<table> getscores24();

    @Select("select score, thisNum ,totolNum ,wlthisNum ,wltotolNum, hxthisNum, hxtotolNum, swthisNum ,swtotolNum ,szthisNum ,sztotolNum, lsthisNum ,lstotolNum, dlthisNum, dltotolNum from table2023")
    public List<table> getscores23();

    @Select("select score, thisNum ,totolNum ,wlthisNum ,wltotolNum, hxthisNum, hxtotolNum, swthisNum ,swtotolNum ,szthisNum ,sztotolNum, lsthisNum ,lstotolNum, dlthisNum, dltotolNum from table2022")
    public List<table> getscores22();

    @Select("select score, thisNum ,totolNum ,wlthisNum ,wltotolNum, hxthisNum, hxtotolNum, swthisNum ,swtotolNum ,szthisNum ,sztotolNum, lsthisNum ,lstotolNum, dlthisNum, dltotolNum from table2021")
    public List<table> getscores21();

    @Select("select score, thisNum ,totolNum ,wlthisNum ,wltotolNum, hxthisNum, hxtotolNum, swthisNum ,swtotolNum ,szthisNum ,sztotolNum, lsthisNum ,lstotolNum, dlthisNum, dltotolNum from table2020")
    public List<table> getscores20();

}
