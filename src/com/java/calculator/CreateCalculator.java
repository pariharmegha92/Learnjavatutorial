package com.java.calculator;

import java.util.Scanner;

public class CreateCalculator {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        Calculator calculator=new Calculator();
        int a;
        int b;
        int choice;
        while(true) {

            System.out.println("If you want to perform addition,press 1 ");
            System.out.println("If you want to perform divide,press 2 ");
            System.out.println("If you want to perform multiplication,press 3 ");
            System.out.println("If you want to perform subtraction,press 4 ");
            System.out.println("If you want to exit this program ,press 0 ");
            choice = scan.nextInt();
            if(choice==0){
                System.exit(0);
            }


            System.out.println("Enter first value : ");
            a=scan.nextInt();
            System.out.println("Enter second value : ");
            b=scan.nextInt();

            switch (choice) {
                case 1:
                    int addition = calculator.addition(a, b);
                    System.out.println("Result is "+addition);
                    break;
                case 2:
                    int divide = calculator.divide(a, b);
                    System.out.println("Result is "+divide);
                    break;
                case 3:
                    int multiplication = calculator.multiplication(a, b);
                    System.out.println("Result is "+multiplication);
                    break;
                case 4:
                    int subtraction = calculator.subtraction(a, b);
                    System.out.println("Result is "+subtraction);
                    break;
                default:
                    System.out.println("Please give proper choice!!!");
                    break;
            }
        }
    }
}
class Calculator implements AppCalculator{
    public int addition(int a , int b){
        int sum=a+b;
        return sum;
    }
    public int multiplication(int a, int b){
        int multi=a*b;
        return multi;
    }
    public int subtraction(int a,int b){
        int subtract=a-b;
        return subtract;
    }
    public int divide(int a ,int b){
        try {
            int sum=a/b;
            return sum;
        }catch (Exception e){
            System.out.println("cannot divide by zero!!");
            return 0;
        }
    }
}

