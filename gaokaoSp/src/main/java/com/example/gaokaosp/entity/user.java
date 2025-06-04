package com.example.gaokaosp.entity;

import javax.persistence.Table;

@Table(name = "user")
public class user {
    private String username;
    private int password;

    public user(String username, int password) {
        this.username = username;
        this.password = password;
    }

    public user() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }
}
