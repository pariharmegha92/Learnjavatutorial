package com.java.AllPractice;

public class StudentClass {
    private int roll;
    private String name;
    private String college;

    public StudentClass() {

    }
    public StudentClass(int roll,String name, String college){
        this.roll=roll;
        this.name=name;
        this.college=college;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setCollege(String college){
        this.college=college;
    }
    public int getRoll(){
        return roll;
    }
    public String getName(){
        return name;
    }
    public String getCollege(){
        return college;
    }


}
