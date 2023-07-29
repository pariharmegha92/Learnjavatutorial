package com.java.learnInheritance;

public class Practicesingleinhritence {
    public static void main(String[] args){

        Salary obj1= new Salary();
        obj1.assigningValues(20.34f ,60.9f);
        obj1.display();
    }
}
class Employee{
    float a;
    float b;

    public void assigningValues(float a , float b){
        System.out.println("set value in parent a variable "+a);
        System.out.println("set value in parent a variable "+b);
        this.a=a;
        this.b=b;
}

}

class Salary extends Employee{
    public float sum(){
        System.out.println("set value in parent a variable"+a);
        System.out.println("set value in parent a variable "+b);
        return a+b;
    }
    public void display(){
        float result = sum();
        System.out.println("Result is"+ result);
    }
}