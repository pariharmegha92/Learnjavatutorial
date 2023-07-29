package com.java.learnInheritance;

public class MultiLevelInheritance {
    public static void main(String[] args) {

        Child child=new Child();
        child.property();
        child.bikes();
        child.toy();

    }

}
class GrandFather{//Super class
    public void grandFather(){
        System.out.println("this  is Grand method!!");
    }
    public void property(){
        System.out.println("grand father property accessing !!");
    }
}
class FatherClass extends GrandFather{//intermediate class
    public void father(){
        System.out.println("this  is father method!!");
    }
    public void bikes(){
        System.out.println("bikes accessing!");
    }
}
class Child extends FatherClass{//derived class
    public void toy(){
        System.out.println("this  is child method!!");
    }
}
