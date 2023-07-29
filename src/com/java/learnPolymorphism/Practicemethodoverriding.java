package com.java.learnPolymorphism;

public class  Practicemethodoverriding {
    public static void main(String[] args){

        Father father1;
        father1 = new Daughternature();
        father1.nature();

        Father father2;
        father2 = new Sonnature();
        father2.nature();
    }
}
class Father{
    public void nature(){
        System.out.println("father nature with sun!");
    }
}
class Sonnature extends Father {
    public void nature(){
        System.out.println("son nature with father!");
    }

}
class Daughternature extends Father{
    public void nature(){
        System.out.println("daughter nature with father!");
    }
}