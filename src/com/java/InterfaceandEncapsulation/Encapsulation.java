package com.java.InterfaceandEncapsulation;

public class Encapsulation {
    private int userid;
    private String username;
    private String userbio;
    private String mobile;
    public Encapsulation(){

    }
    public void putUserId(int userid){
        this.userid=userid;
    }
    public void putUserName(String name){
        this.username=name;
    }
    public void putUserBio(String userbio){
        this.userbio=userbio;
    }
    public void putMobile(String mobile){
        this.mobile=mobile;
    }
    public int getUserId(){
        return userid;
    }
    public String getUsername(){
        return username;
    }
    public String getUserbio(){
        return userbio;
    }
    public String getMobile(){
        return mobile;
    }
}
