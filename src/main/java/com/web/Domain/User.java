package com.web.Domain;

public class User {
    private int idx;
    private String username;
    private String password;

    public int getIdx(){
        return idx;
    }

    public void setIdx(int idx){
        this.idx = idx;
    }

    public String getUsername(){
        return username;
    }

    public void setUsername(String username){
        this.username = username;
    }

    public String getPassword(){
        return password;
    }

    public void setPassword(String password){
        this.password = password;
    }
}
