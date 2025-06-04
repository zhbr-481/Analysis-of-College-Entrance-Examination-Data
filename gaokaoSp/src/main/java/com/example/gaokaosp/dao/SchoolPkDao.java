package com.example.gaokaosp.dao;

import com.example.gaokaosp.entity.Params;
import com.example.gaokaosp.entity.schooltype;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

@Repository
public interface SchoolPkDao extends Mapper<schooltype> {
    @Select("select province,type,type1,year,batch,schoolcode,specialtycode,specialty,number,tuition,time,request from nongke where schoolname = #{schoolname} ")
    public List<schooltype> getschoolnk(schooltype schooltype);

    @Select("select province,type,type1,year,batch,schoolcode,specialtycode,specialty,number,tuition,time,request from nongke where schoolname = #{schoolname} and specialty=#{specialty} ")
    public List<schooltype> getschooldetailnk(schooltype schooltype);

    @Select("select province,type,batch,schoolcode,specialtycode,specialty,number,tuition,time,request from second where schoolname = #{schoolname} ")
    public List<schooltype> getschoolsecond(schooltype schooltype);

    @Select("select province,type,batch,schoolcode,specialtycode,specialty,number,tuition,time,request from second where schoolname = #{schoolname} and specialty=#{specialty} ")
    public List<schooltype> getschooldetailsecond(schooltype schooltype);

    @Select("select province,type,type1,year,batch,schoolcode,specialtycode,specialty,number,tuition,time,request from yixue where schoolname = #{schoolname} ")
    public List<schooltype> getschoolyx(schooltype schooltype);

    @Select("select province,type,type1,year,batch,schoolcode,specialtycode,specialty,number,tuition,time,request from yixue where schoolname = #{schoolname} and specialty=#{specialty} ")
    public List<schooltype> getschooldetailyx(schooltype schooltype);

    @Select("select province,type,type1,year,batch,schoolcode,specialtycode,specialty,number,tuition,time,request from solider where schoolname = #{schoolname} ")
    public List<schooltype> getschoolsolider(schooltype schooltype);

    @Select("select province,type,type1,year,batch,schoolcode,specialtycode,specialty,number,tuition,time,request from solider where schoolname = #{schoolname} and specialty=#{specialty} ")
    public List<schooltype> getschooldetailsolider(schooltype schooltype);

    @Select("select province,type,batch,schoolcode,specialtycode,specialty,number,tuition,time,request from bkadvanced where schoolname = #{schoolname} ")
    public List<schooltype> getschoolbk(schooltype schooltype);

    @Select("select province,type,batch,schoolcode,specialtycode,specialty,number,tuition,time,request from bkadvanced where schoolname = #{schoolname} and specialty=#{specialty} ")
    public List<schooltype> getschooldetailbk(schooltype schooltype);

    @Select("select province,type,type1,year,batch,schoolcode,specialtycode,specialty,number,tuition,time,request from shifan where schoolname = #{schoolname} ")
    public List<schooltype> getschoolshifan(schooltype schooltype);

    @Select("select province,type,type1,year,batch,schoolcode,specialtycode,specialty,number,tuition,time,request from shifan where schoolname = #{schoolname} and specialty=#{specialty} ")
    public List<schooltype> getschooldetailshifan(schooltype schooltype);

}
