package com.java.learnException;

import com.sun.jdi.event.ExceptionEvent;

public class PracticeException {
    public static void main(String[] args) {
        System.out.println("start the program!!");
        PracticeException practiceException = new PracticeException();
        practiceException.example1();
        practiceException.example2();
        practiceException.example3();
        System.out.println("please run my peogram!!");
    }

    public void example1() throws ArithmeticException{
        int a = 20 / 2;
        System.out.println("Result is "+a);
    }

    public void example2() {
        try {
            int arr[] = new int[13];
            arr[20] = 14;
            System.out.println("Result" + arr[20]);
        } catch (Exception e) {
            System.out.println("don't show me exception!!");
        } finally {
            System.out.println("connection close successfully..");
        }
    }
    public void example3(){
        throw new ArithmeticException();
    }
}
