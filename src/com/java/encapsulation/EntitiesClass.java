package com.java.encapsulation;

public class EntitiesClass {
    private String uname;
    private String mobile;
    public int a=10;

    public EntitiesClass(String uname,String mobile){
        this.uname=uname;
        this.mobile=mobile;
    }
    public EntitiesClass(){
    }

    public void setUname(String uname){
        if(uname.length()<=10){
            this.uname=uname;
        }else{
            System.out.println("Please provide the valid size!!");
        }
    }
    public void setMobile(String mobile){
        this.mobile=mobile;
    }

    public String getUname(){
        System.out.println("get name");
        return uname;
    }
    public String getMobile(){
        System.out.println("get mobile");
        return mobile;
    }

}
