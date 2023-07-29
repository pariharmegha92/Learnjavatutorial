package com.java;

import java.util.Scanner;

public class LearnString {
    public static void main(String[] args) {
        //learn split method in string
        String test="namaste@dunya@Every@Good";
        String[] arr = test.split("@");
        System.out.println("Result is "+ arr[0]);

        //learn how to reverse an any string
        String test1="helloworld";
        char[] chrr = test1.toCharArray();

        for(int i=0;i<chrr.length;i++){
            System.out.print(chrr[i]);
        }
        String test2[]=new String[5];//initialization array
        Scanner sc=new Scanner(System.in);
        test2[2]=sc.nextLine();
    }
}
