package com.example.gaokaosp.dao;

import com.example.gaokaosp.entity.toudang;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

@Repository
public interface ToudangDao extends Mapper<toudang> {
    @Select("SELECT specialty, schoolname, planNum, place FROM toudang WHERE place < #{place} ORDER BY place DESC LIMIT 50")
    List<toudang> getToudang(toudang toudang);
}
