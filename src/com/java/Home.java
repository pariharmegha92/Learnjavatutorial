package com.java;



public class Home {
    public static void main(String[] args) {
        Home board= new Home();
        board.grandfather();

    }

    public void childers(){
        System.out.println("this is childers");
    }
    public void grandfather(){
        System.out.println("this is grandfather");
    }
    public void parents(){
        System.out.println("this is parents");
    }
}
