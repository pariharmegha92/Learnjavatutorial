package com.java.Practice;

public class ExceptionPractice {
    public static void main(String[] args){
        ExceptionPractice exceptionPractice=new ExceptionPractice();
        exceptionPractice.method1();
        exceptionPractice.method2();
        System.out.println("please create my  program@@");

    }
    public void method1(){
        int result=20/2;
        System.out.println(result);
    }
    public void method2() {
        try {
            int arr[] = new int[5];
            arr[9] = 12;
            System.out.println("result" + arr[9]);
        }catch (Exception e){
            System.out.println("the program @@");
        }
        }
    }


