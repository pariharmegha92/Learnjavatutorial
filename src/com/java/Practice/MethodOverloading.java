package com.java.Practice;

import java.util.Scanner;

public class MethodOverloading {
    public static void main(String[] args){
        Calculation1 calculation=new Calculation1();
        calculation.multiplication(20,2,30);

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a value : ");
        int a = sc.nextInt();
        System.out.println("Enter b value : ");
        int b=sc.nextInt();

        try {
            int result = calculation.divideTwoNum(a, b);
            System.out.println("Result is " + result);
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("program end...");

    }
}
class Calculation1{
    public void multiplication(int a, int b){
        int multi=a*b;
        System.out.println(multi);

    }
    public void multiplication(int a ,int b,int c) {
        int multi = a * b * c;
        System.out.println(multi);
    }
    public int divideTwoNum(int a,int b){
        int sum=a/b;
        return sum;
    }

}

