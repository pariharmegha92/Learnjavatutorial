package com.java.Practice;



public class AbstractPractice {
    public static void main(String[] args){
        SBI obj=new SBI();
        obj.account();
        obj.counter();
        obj.employee();
        obj.manager();


    }
}
abstract class Bank{
    public abstract void account();
    public abstract void counter();
    public abstract void employee();
    public abstract void manager();

}
 class SBI extends Bank{
    public void account(){
        System.out.println("my account number ..........!!");
    }
     public void counter() {
        System.out.println("number of counters in bank!!");

     }

     @Override
     public void employee() {
         System.out.println("employees in the bank!!");
     }

     @Override
     public void manager() {
         System.out.println("manager ......@@");
     }
 }