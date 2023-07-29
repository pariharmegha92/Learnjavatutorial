package com.java.Practice;

import java.util.Scanner;

public class UserInputPractice {
    //1.print msg enter your age
    //2. user input[arr]
    //3.print msg enter your name
    //4.user input[arr]
    //5.print all user age with his/her name

    public static void main(String[] args) {
        int age2[] = new int[4];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < age2.length; i++) {
            System.out.println("print the age : " + i);
            age2[i] = sc.nextInt();

        }

        for (int i = 0; i < age2.length; i++) {
        System.out.println("your age is : " +age2[i]);
        }
        String name[]=new String[2];


        for(int i=0;i<name.length;i++){
            System.out.println("enter name!!" + i);
            name[i]= sc.next();
        }

        for (int i=0; i<name.length;i++){
            System.out.println("print name !:" +name[i]);
        }


    }
}


