package com.java.learnPolymorphism;

public class MethodOverloadingConcept {
    public static void main(String[] args) {

        Calculation calculation=new Calculation();
        calculation.addition(10,20,30);

    }
}
class Calculation{
    public void addition(int a,int b){
        int sum = a+b;
        System.out.println(sum);
    }
    public void addition(int a,int b,int c){
        int sum= a+b+c;
        System.out.println(sum);
    }
    public void addition(double a,int b){
        System.out.println(a+" "+b);
    }
    public void addition(String a){
        System.out.println(a);
    }
    public void addition(int a,int b,double c){

    }
}
