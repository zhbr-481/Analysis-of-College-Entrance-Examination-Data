package com.example.gaokaosp.Controller;

import com.example.gaokaosp.Common.Result;
import com.example.gaokaosp.Service.SchoolPkService;
import com.example.gaokaosp.Service.SchoolService;
import com.example.gaokaosp.entity.schooltype;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/schoolPk")
public class SchoolPkController {
    @Resource
    private SchoolPkService schoolPkService;
    @GetMapping("/nongke")
    public Result getschoolnk(schooltype schooltype){
        List<schooltype> list = schoolPkService.getschoolnk(schooltype);

        return Result.success(list);
    }

    @GetMapping("nongkedetail")
    public Result getschooldetailnk(schooltype schooltype){
        List<schooltype> list = schoolPkService.getschooldetailnk(schooltype);
        return Result.success(list);
    }

    @GetMapping("/second")
    public Result getschoolsecond(schooltype schooltype){
    System.out.println(schooltype.getSchoolname());
        List<schooltype> list = schoolPkService.getschoolsecond(schooltype);

        return Result.success(list);
    }

    @GetMapping("seconddetail")
    public Result getschooldetailsecond(schooltype schooltype){
        List<schooltype> list = schoolPkService.getschooldetailsecond(schooltype);
        return Result.success(list);
    }

    @GetMapping("/yx")
    public Result getschoolyx(schooltype schooltype){

        List<schooltype> list = schoolPkService.getschoolyx(schooltype);

        return Result.success(list);
    }

    @GetMapping("yxdetail")
    public Result getschooldetailyx(schooltype schooltype){
        List<schooltype> list = schoolPkService.getschooldetailyx(schooltype);
        return Result.success(list);
    }

    @GetMapping("/solider")
    public Result getschoolsolider(schooltype schooltype){

        List<schooltype> list = schoolPkService.getschoolsolider(schooltype);

        return Result.success(list);
    }

    @GetMapping("soliderdetail")
    public Result getschooldetailsolider(schooltype schooltype){
        List<schooltype> list = schoolPkService.getschooldetailsolider(schooltype);
        return Result.success(list);
    }

    @GetMapping("/bk")
    public Result getschoolbk(schooltype schooltype){

        List<schooltype> list = schoolPkService.getschoolbk(schooltype);

        return Result.success(list);
    }

    @GetMapping("bkdetail")
    public Result getschooldetailbk(schooltype schooltype){
        List<schooltype> list = schoolPkService.getschooldetailbk(schooltype);
        return Result.success(list);
    }

    @GetMapping("/shifan")
    public Result getschoolshifan(schooltype schooltype){

        List<schooltype> list = schoolPkService.getschoolshifan(schooltype);

        return Result.success(list);
    }

    @GetMapping("shifandetail")
    public Result getschooldetailshifan(schooltype schooltype){
        List<schooltype> list = schoolPkService.getschooldetailshifan(schooltype);
        return Result.success(list);
    }
}
