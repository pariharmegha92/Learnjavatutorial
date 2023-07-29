package com.java.AllPractice;

public class ExceptionPractice {
    public static void main(String[] args) {
        ExceptionPractice exceptionPractice = new ExceptionPractice();
        exceptionPractice.method1();
        exceptionPractice.method2();
        exceptionPractice.method3();
    }

    public void method1() {
        int result = 20 / 10;
        System.out.println(result);
    }

    public void method2() {
        try {
            int result = 10 / 0;
            System.out.println(result);
        } catch (Exception e) {
            System.out.println("show my result without any exception !!");

        }
    }

    public void method3() {
        try {
            int arr[] = new int[2];
            arr[4] = 6;
            System.out.println("print my result!" + arr[4]);
        } catch (Exception e) {
            System.out.println("please give me proper answer");

        }
    }
}
