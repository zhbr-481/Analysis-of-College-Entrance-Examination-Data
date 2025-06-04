package com.example.gaokaosp.entity;

import javax.persistence.Table;

@Table(name = "toudang")
public class toudang {
    private String specialty;
    private String schoolname;
    private int planNum;
    private int place;

    public toudang(String specialty, String schoolname, int planNum, int place) {
        this.specialty = specialty;
        this.schoolname = schoolname;
        this.planNum = planNum;
        this.place = place;
    }

    public toudang() {
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public String getSchoolname() {
        return schoolname;
    }

    public void setSchoolname(String schoolname) {
        this.schoolname = schoolname;
    }

    public int getPlanNum() {
        return planNum;
    }

    public void setPlanNum(int planNum) {
        this.planNum = planNum;
    }

    public int getPlace() {
        return place;
    }

    public void setPlace(int place) {
        this.place = place;
    }
}
