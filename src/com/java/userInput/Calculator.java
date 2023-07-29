package com.java.userInput;

import java.util.Scanner;

public class Calculator {
    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter a value ");
//        int x=sc.nextInt();
//        System.out.println("Enter b value ");
//        int y=sc.nextInt();
        System.out.println("Enter your name");
        String name=sc.nextLine();

        Calculator cal=new Calculator();
//        cal.addition(x,y);
//        cal.substraction(x,y);
//        cal.multiplication(x,y);
//        int result=cal.division(x,y);
//        System.out.println("hey,buddy lets comes to divide two number = "+result);

        String result=cal.username(name);
        System.out.println(result+" program");

        System.out.println("End program");


    }
    public void addition(int a,int b){
        int sum=a+b;
        System.out.println("Addition of two numbers = "+a+"+"+b+"="+sum);
    }
    public void substraction(int a,int b){
        int sum=a-b;
        System.out.println(a+"-"+b+"="+sum);
    }
    public void multiplication(int a,int b){
        int multi=a*b;
        System.out.println(a+"*"+b+"="+multi);
    }
    public int division(int a , int b){
        int div=a/b;
        return div;
    }

    public String username(String name){
        String finalname="welcome,"+name+" comes to techninjas";
        return finalname;
    }
}
