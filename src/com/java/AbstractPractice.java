package com.java;

public class AbstractPractice {
    public static void main(String[] args){
        Shapeinformation information=new Shapeinformation();
        information.cricle();
        information.triangle();
        information.square();
    }
}
 abstract class Shape{
    public abstract void cricle();
    public abstract void triangle();
    public abstract void square();

 }

 class Shapeinformation extends Shape{
     public void cricle() {
         System.out.println("shape is a cricle!");

     }
     public void triangle() {
         System.out.println("shape is a triangle@");

     }
     public void square() {
         System.out.println("shape is a square@@");

     }

 }




