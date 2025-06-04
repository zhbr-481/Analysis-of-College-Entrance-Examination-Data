package com.example.gaokaosp.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.List;

@Table(name = "gaokaodata")
public class school {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String schoolname;
    private String location;
    private String type1;
    private String type2;
    private String type3;
    private String kuozhao;
    private String image;
    private String plan;
    private String majornum;
    private String zslist;
    private String guanwang;

    public school() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSchoolname() {
        return schoolname;
    }

    public void setSchoolname(String schoolname) {
        this.schoolname = schoolname;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getType1() {
        return type1;
    }

    public void setType1(String type1) {
        this.type1 = type1;
    }

    public String getType2() {
        return type2;
    }

    public void setType2(String type2) {
        this.type2 = type2;
    }

    public String getType3() {
        return type3;
    }

    public void setType3(String type3) {
        this.type3 = type3;
    }

    public String getKuozhao() {
        return kuozhao;
    }

    public void setKuozhao(String kuozhao) {
        this.kuozhao = kuozhao;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getPlan() {
        return plan;
    }

    public void setPlan(String plan) {
        this.plan = plan;
    }

    public String getMajornum() {
        return majornum;
    }

    public void setMajornum(String majornum) {
        this.majornum = majornum;
    }

    public String getZslist() {
        return zslist;
    }

    public void setZslist(String zslist) {
        this.zslist = zslist;
    }

    public String getGuanwang() {
        return guanwang;
    }

    public void setGuanwang(String guanwang) {
        this.guanwang = guanwang;
    }

    public school(Integer id, String schoolname, String location, String type1, String type2, String type3, String kuozhao, String image, String plan, String majornum, String zslist, String guanwang) {
        this.id = id;
        this.schoolname = schoolname;
        this.location = location;
        this.type1 = type1;
        this.type2 = type2;
        this.type3 = type3;
        this.kuozhao = kuozhao;
        this.image = image;
        this.plan = plan;
        this.majornum = majornum;
        this.zslist = zslist;
        this.guanwang = guanwang;
    }
}

