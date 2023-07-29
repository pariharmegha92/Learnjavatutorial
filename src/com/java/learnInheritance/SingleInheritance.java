package com.java.learnInheritance;

public class SingleInheritance {
    public static void main(String[] args) {


        AccessClass obj1=new AccessClass();
        obj1.assigningValues(20,10);
        obj1.display();


    }
}
//Single-inheritance
class Mathematics{//parent class/base class
    int a;
    int b;
    public void assigningValues(int a,int b){
        System.out.println("set value in parent a varible "+a);
        System.out.println("set value in parent b varible "+b);
        this.a=a;
        this.b=b;
    }

}
class AccessClass extends Mathematics{//child class / derived class
    public int sum(){
        System.out.println("set value in a varible"+a);
        System.out.println("set value in b varible"+b);
        return a+b;
    }
    public void display(){
        int result=sum();
        System.out.println("Result is "+result);
    }

}
