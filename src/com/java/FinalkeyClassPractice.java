package com.java;

public class FinalkeyClassPractice {
    public static void main (String[] args){
        Children children1 =new Children();
        children1.children();

    }
}

class Father{
    final int a=10;
    public void father(){
        System.out.println("father is a final class");
    }
    public final void behave(){
        System.out.println("father behaviour!!");
    }
}
class Children extends Father{
    public void children(){
        System.out.println("child is drive class "+a);
    }
    public void nature(){
        System.out.println("nature of child!");
    }
}