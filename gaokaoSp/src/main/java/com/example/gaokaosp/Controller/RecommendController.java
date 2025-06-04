package com.example.gaokaosp.Controller;

import com.example.gaokaosp.Common.Result;
import com.example.gaokaosp.Service.ToudangService;
import com.example.gaokaosp.entity.toudang;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/toudang")
public class RecommendController {
    @Resource
    private ToudangService toudangService;

    @GetMapping("/toudang1")
    public Result recommend(toudang toudang){
        List list =toudangService.getToudang(toudang);
        System.out.print(Result.success(list));
        return Result.success(list);

    }
}
