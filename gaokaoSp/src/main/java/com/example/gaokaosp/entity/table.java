package com.example.gaokaosp.entity;

import javax.persistence.Table;

@Table(name = "table")
public class table {
    private Integer pageNum;
    private Integer pageSize;
    private Integer score;
    private Integer thisNum;
    private Integer totolNum;
    private Integer wlthisNum;
    private Integer wltotolNum;

    private Integer hxthisNum;
    private Integer hxtotolNum;
    private Integer swthisNum;

    private Integer swtotolNum;

    private Integer szthisNum;

    private Integer sztotolNum;

    private Integer lsthisNum;

    private Integer lstotolNum;

    private Integer dlthisNum;

    private Integer dltotolNum;

    public table(Integer pageNum, Integer pageSize, Integer score, Integer thisNum, Integer totolNum, Integer wlthisNum, Integer wltotolNum, Integer hxthisNum, Integer hxtotolNum, Integer swthisNum, Integer swtotolNum, Integer szthisNum, Integer sztotolNum, Integer lsthisNum, Integer lstotolNum, Integer dlthisNum, Integer dltotolNum) {
        this.pageNum = pageNum;
        this.pageSize = pageSize;
        this.score = score;
        this.thisNum = thisNum;
        this.totolNum = totolNum;
        this.wlthisNum = wlthisNum;
        this.wltotolNum = wltotolNum;
        this.hxthisNum = hxthisNum;
        this.hxtotolNum = hxtotolNum;
        this.swthisNum = swthisNum;
        this.swtotolNum = swtotolNum;
        this.szthisNum = szthisNum;
        this.sztotolNum = sztotolNum;
        this.lsthisNum = lsthisNum;
        this.lstotolNum = lstotolNum;
        this.dlthisNum = dlthisNum;
        this.dltotolNum = dltotolNum;
    }

    public table() {
    }

    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Integer getThisNum() {
        return thisNum;
    }

    public void setThisNum(Integer thisNum) {
        this.thisNum = thisNum;
    }

    public Integer getTotolNum() {
        return totolNum;
    }

    public void setTotolNum(Integer totolNum) {
        this.totolNum = totolNum;
    }

    public Integer getWlthisNum() {
        return wlthisNum;
    }

    public void setWlthisNum(Integer wlthisNum) {
        this.wlthisNum = wlthisNum;
    }

    public Integer getWltotolNum() {
        return wltotolNum;
    }

    public void setWltotolNum(Integer wltotolNum) {
        this.wltotolNum = wltotolNum;
    }

    public Integer getHxthisNum() {
        return hxthisNum;
    }

    public void setHxthisNum(Integer hxthisNum) {
        this.hxthisNum = hxthisNum;
    }

    public Integer getHxtotolNum() {
        return hxtotolNum;
    }

    public void setHxtotolNum(Integer hxtotolNum) {
        this.hxtotolNum = hxtotolNum;
    }

    public Integer getSwthisNum() {
        return swthisNum;
    }

    public void setSwthisNum(Integer swthisNum) {
        this.swthisNum = swthisNum;
    }

    public Integer getSwtotolNum() {
        return swtotolNum;
    }

    public void setSwtotolNum(Integer swtotolNum) {
        this.swtotolNum = swtotolNum;
    }

    public Integer getSzthisNum() {
        return szthisNum;
    }

    public void setSzthisNum(Integer szthisNum) {
        this.szthisNum = szthisNum;
    }

    public Integer getSztotolNum() {
        return sztotolNum;
    }

    public void setSztotolNum(Integer sztotolNum) {
        this.sztotolNum = sztotolNum;
    }

    public Integer getLsthisNum() {
        return lsthisNum;
    }

    public void setLsthisNum(Integer lsthisNum) {
        this.lsthisNum = lsthisNum;
    }

    public Integer getLstotolNum() {
        return lstotolNum;
    }

    public void setLstotolNum(Integer lstotolNum) {
        this.lstotolNum = lstotolNum;
    }

    public Integer getDlthisNum() {
        return dlthisNum;
    }

    public void setDlthisNum(Integer dlthisNum) {
        this.dlthisNum = dlthisNum;
    }

    public Integer getDltotolNum() {
        return dltotolNum;
    }

    public void setDltotolNum(Integer dltotolNum) {
        this.dltotolNum = dltotolNum;
    }
}
