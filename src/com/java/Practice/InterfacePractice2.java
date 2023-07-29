package com.java.Practice;

public class InterfacePractice2 {
    public static void main(String[] args){
        Management obj= new Management();
        obj.rooms();
        obj.lifts();
        obj.staff();
    }
}
interface Hotel{
    public void rooms();
    public void lifts();
    public void staff();
}
class Management implements Hotel{
    public void rooms(){
        System.out.println("number of room in hotel@@");
    }
    public void lifts(){
        System.out.println("number of lifts in hotel!!");
    }
    public void staff(){
        System.out.println("number of staff in hotel!@");
    }

}


