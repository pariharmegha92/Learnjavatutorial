package com.java.AllPractice;

public class MainClass {
    public static void main(String[] args){
        StudentClass studentClass=new StudentClass();
        studentClass.setRoll(63);
        studentClass.setName("megha");
        studentClass.setCollege("SIRT");
        System.out.println(studentClass.getRoll()+" "+studentClass.getName()+" "+studentClass.getCollege());
    }
}
