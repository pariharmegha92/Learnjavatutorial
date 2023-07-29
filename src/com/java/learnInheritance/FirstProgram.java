package com.java.learnInheritance;

import org.w3c.dom.ls.LSOutput;

public class FirstProgram {
    public static void main(String[] args) {
        ParentClass obj = new ParentClass();
        obj.tv();
    }
}

//Single-Inheritance concept
class ParentClass {
    int x1;
    int y1;

    public void washingMachine(int x1, int y1) {
        System.out.println("you are accessing washing machine!!");
        this.x1=x1;
        this.y1=y1;
    }

    public void tv() {
        System.out.println("you are accessing t.v");
//        System.out.println(a+b);
    }

}

//child class
class ChildClass extends ParentClass {
    public static void chlidAccessingWashingMachine() {

    }

}

