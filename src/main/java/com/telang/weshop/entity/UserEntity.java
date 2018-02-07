package com.telang.weshop.entity;

import com.mysql.fabric.xmlrpc.base.Data;

public class UserEntity {
    int id;
    String username;
    String password;
    Data regTime;
    public UserEntity() {
        super();
        // TODO Auto-generated constructor stub
    }
    public UserEntity(int id, String username, String password, Data regTime) {
        super();
        this.id = id;
        this.username = username;
        this.password = password;
        this.regTime = regTime;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public Data getRegTime() {
        return regTime;
    }
    public void setRegTime(Data regTime) {
        this.regTime = regTime;
    }
}
