package com.java.practiceEncapsulation;

public class OuterClass1 {
    private String username;
    private int userid;
    private String mobile;

    public OuterClass1() {
    }

    public void setUsername(String username) {
        if (username.length() < 6) {
            this.username = username;
        } else {
            System.out.println("not allowed!!");
        }
    }

    public void setUserid(int userid) {
        if (userid != 0) {
            if (userid <102) {
                this.userid = userid;
            } else {
                System.out.println("Please select the range between 1 to 100!!");
            }
        } else {
            System.out.println("Kya krr rha hai zero nhi dena!!");
        }

    }

    public void setMobile(String mobile) {
        if (mobile.length() < 10) {
            this.mobile = mobile;
        } else {
            System.out.println("please provide the valid size of mobile number!!");
        }

    }

    public String getUsername() {
        System.out.println("get usrename!!");
        return username;

    }

    public int getUserid() {
        return userid;
    }

    public String getMobile() {
        return mobile;
    }
}

