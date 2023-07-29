package com.java.learnException;

public class LearnException {
    public static void main(String[] args) {

        System.out.println("perform operation!! lets start..");
        LearnException learnException=new LearnException();
        learnException.method1();//give us exception
        learnException.method2();//give us exception
        System.out.println("end operation!! End..");
    }
    public void method1(){
        try {
            int result = 10 / 0;//unchecked
            System.out.println(result);
        }catch (Exception e){
            System.out.println("Please give proper no. ");
        }

    }
    public void method2(){
        try {
            int arr[] = new int[5];
            arr[7] = 12;
            System.out.println("Result " + arr[7]);
        }catch (Exception e){
            System.out.println("give proper index");
        }
    }

}
