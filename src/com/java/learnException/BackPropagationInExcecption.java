package com.java.learnException;

public class BackPropagationInExcecption {
    public static void main(String[] args) {
        BackPropagationInExcecption backPropagationInExcecption=new BackPropagationInExcecption();
        try {
            backPropagationInExcecption.method1();
        }catch (Exception e){
            System.out.println("cannot divide by zero");
        }
    }
    public void method1(){
        System.out.println("method1 is calling..");
        method2();
        System.out.println("method1 is called..");
    }
    public void method2(){
        System.out.println("method2 is calling..");
        method3();
        System.out.println("method2 is called..");
    }
    public void method3(){
        System.out.println("method3 is calling..");
        try {
            method4();
        }catch (Exception e){
            System.out.println("handled");
        }
        System.out.println("method3 is called..");
    }
    public void method4(){//home
        int sum=10/0;
    }
}
