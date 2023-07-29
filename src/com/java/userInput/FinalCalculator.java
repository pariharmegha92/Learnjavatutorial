package com.java.userInput;

import java.util.Scanner;

public class FinalCalculator {
    public static void main(String[] args) {

        FinalCalculator finalCalculator = new FinalCalculator();
        Scanner scanner=new Scanner(System.in);
//        int i = finalCalculator.selectAssignmentOperator1('h', 10, 5);
//        System.out.println("result is " + i);


//        int size=1;
//        int num;
//        int[] arr= new int[size];
//        for(int i=0;i<size;i++){
//            System.out.println("Exit program, press 0");
//            int enter=scanner.nextInt();
//            if(0==enter){
//                System.exit(0);
//            }
//            num=scanner.nextInt();
//            arr[i]=num;
//            num=0;
//        }
        int arr[]={12,2,1};
        int i1 = finalCalculator.selectAssignmentOperator2('-', arr);
        System.out.println("REsult is "+i1);


    }

    public int selectAssignmentOperator1(char ch, int a, int b) {
        if (ch == '*' || ch == '+' || ch == '-') {
            if (ch == '*') {
                int sum = a * b;
                return sum;
            } else if (ch == '+') {
                int sum = a + b;
                return sum;
            } else if (ch == '-') {
                int sum = a - b;
                return sum;
            }
        } else {
            System.out.println("Please sure! This is not a assignment operator");
        }
        return 0;
    }

    public int selectAssignmentOperator2(int ch, int[] arr) {
        if (ch == '*' || ch == '+' || ch == '-') {
            if (ch == '*') {
                int sum = 1;
                for(int i=0;i< arr.length;i++){
                    int temp=arr[i];
                    sum=temp*sum;
                }
                return sum;
            } else if (ch == '+') {
                int sum = 0;
                for(int i=0;i< arr.length;i++){
                    sum+=arr[i];
                }
                return sum;
            } else if (ch == '-') {
                int sum = 0;
                for(int i=0;i< arr.length;i++){
                    sum-=arr[i];
                }
                return sum;
            }
        } else {
            System.out.println("Please sure! This is not a assignment operator");
        }
        return 0;
    }
}
