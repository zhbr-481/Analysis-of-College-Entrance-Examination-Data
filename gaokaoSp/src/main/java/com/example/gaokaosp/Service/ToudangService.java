package com.example.gaokaosp.Service;

import com.example.gaokaosp.dao.ToudangDao;
import com.example.gaokaosp.entity.toudang;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ToudangService {
    @Resource
    private ToudangDao toudangDao;

    public List<toudang> getToudang(toudang toudang){
        return toudangDao.getToudang(toudang);
    }
}
