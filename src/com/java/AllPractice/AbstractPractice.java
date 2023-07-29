package com.java.AllPractice;

public class AbstractPractice {
    public static void main(String[] args){
        Honda abstractPractice= new Honda();
        abstractPractice.run();
    }
}
abstract class Bike{
    public abstract void run();

}
class Honda extends Bike{
    public void run(){
        System.out.println("running safely");
    }
}
