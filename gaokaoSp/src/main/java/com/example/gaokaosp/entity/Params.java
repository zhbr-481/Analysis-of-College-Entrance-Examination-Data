package com.example.gaokaosp.entity;

public class Params {
    private Integer pageNum;
    private Integer pageSize;
    private String findSchoolName;

    public Params(Integer pageNum, Integer pageSize, String findSchoolName) {
        this.pageNum = pageNum;
        this.pageSize = pageSize;
        this.findSchoolName = findSchoolName;
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

    public String getFindSchoolName() {
        return findSchoolName;
    }

    public void setFindSchoolName(String findSchoolName) {
        this.findSchoolName = findSchoolName;
    }

    public Params() {
    }
}
