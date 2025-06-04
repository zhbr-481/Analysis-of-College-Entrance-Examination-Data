package com.example.gaokaosp.Service;

import com.example.gaokaosp.dao.GaokaoDao;
import com.example.gaokaosp.dao.SchoolPkDao;
import com.example.gaokaosp.entity.schooltype;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class SchoolPkService {
    @Resource
    private SchoolPkDao schoolPkDaokdao;

    public List<schooltype> getschoolnk(schooltype schooltype){
        return schoolPkDaokdao.getschoolnk(schooltype);
    }

    public List<schooltype> getschooldetailnk(schooltype schooltype){
        return schoolPkDaokdao.getschooldetailnk(schooltype);
    }

    public List<schooltype> getschoolsecond(schooltype schooltype){
        System.out.println(schooltype.getSchoolname());
        return schoolPkDaokdao.getschoolsecond(schooltype);
    }

    public List<schooltype> getschooldetailsecond(schooltype schooltype){

        return schoolPkDaokdao.getschooldetailsecond(schooltype);
    }


    public List<schooltype> getschoolyx(schooltype schooltype){

        return schoolPkDaokdao.getschoolyx(schooltype);
    }

    public List<schooltype> getschooldetailyx(schooltype schooltype){
        System.out.println(schoolPkDaokdao.getschooldetailyx(schooltype));
        return schoolPkDaokdao.getschooldetailyx(schooltype);
    }

    public List<schooltype> getschoolsolider(schooltype schooltype){

        return schoolPkDaokdao.getschoolsolider(schooltype);
    }

    public List<schooltype> getschooldetailsolider(schooltype schooltype){

        return schoolPkDaokdao.getschooldetailsolider(schooltype);
    }

    public List<schooltype> getschoolbk(schooltype schooltype){

        return schoolPkDaokdao.getschoolbk(schooltype);
    }

    public List<schooltype> getschooldetailbk(schooltype schooltype){

        return schoolPkDaokdao.getschooldetailbk(schooltype);
    }

    public List<schooltype> getschoolshifan(schooltype schooltype){

        return schoolPkDaokdao.getschoolshifan(schooltype);
    }

    public List<schooltype> getschooldetailshifan(schooltype schooltype){

        return schoolPkDaokdao.getschooldetailshifan(schooltype);
    }

}
