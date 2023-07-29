package com.java.userInput;
import java.util.Scanner;
public class UserInput {
    public static void main(String[] args) {
//        String name;
//        String gender;
//        double calc;
//        int age;

        Scanner inp=new Scanner(System.in);

        System.out.println("Enter name here ");
        String name=inp.next();

        System.out.println("Enter age here");
        int age=inp.nextInt();

        System.out.println("Enter current calcus");
        double calc=inp.nextDouble();


        System.out.println("THis is name = "+name+", this is age = "+age+", this is current cal = "+calc);

    }
}
