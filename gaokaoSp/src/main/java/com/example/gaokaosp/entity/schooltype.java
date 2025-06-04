package com.example.gaokaosp.entity;

public class schooltype {
    private String province;
    private String type;
    private String year;
    private String batch;
    private String type1;
    private String schoolcode;
    private String schoolname;
    private String specialtycode;
    private String specialty;
    private String number;
    private String tuition;
    private String time;
    private String request;

    public schooltype() {
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public String getType1() {
        return type1;
    }

    public void setType1(String type1) {
        this.type1 = type1;
    }

    public String getSchoolcode() {
        return schoolcode;
    }

    public void setSchoolcode(String schoolcode) {
        this.schoolcode = schoolcode;
    }

    public String getSchoolname() {
        return schoolname;
    }

    public void setSchoolname(String schoolname) {
        this.schoolname = schoolname;
    }

    public String getSpecialtycode() {
        return specialtycode;
    }

    public void setSpecialtycode(String specialtycode) {
        this.specialtycode = specialtycode;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getTuition() {
        return tuition;
    }

    public void setTuition(String tuition) {
        this.tuition = tuition;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getRequest() {
        return request;
    }

    public void setRequest(String request) {
        this.request = request;
    }

    public schooltype(String province, String type, String year, String batch, String type1, String schoolcode, String schoolname, String specialtycode, String specialty, String number, String tuition, String time, String request) {
        this.province = province;
        this.type = type;
        this.year = year;
        this.batch = batch;
        this.type1 = type1;
        this.schoolcode = schoolcode;
        this.schoolname = schoolname;
        this.specialtycode = specialtycode;
        this.specialty = specialty;
        this.number = number;
        this.tuition = tuition;
        this.time = time;
        this.request = request;
    }
}
