package com.java.practiceEncapsulation;

public class PracticeClass {
    public static void main(String[] args){
        OuterClass1 obj1=new OuterClass1();
        obj1.setUsername("abcd");
        obj1.setUserid(0);
        obj1.setMobile("288746626");

        System.out.println(obj1.getUsername()+" "+obj1.getUserid()+" "+obj1.getMobile());
    }
}
