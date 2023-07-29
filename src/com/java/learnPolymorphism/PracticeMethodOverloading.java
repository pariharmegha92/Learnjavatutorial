package com.java.learnPolymorphism;

public class PracticeMethodOverloading {
    public static void main(String[] args){
        Family family=new Family();
        family.member(10,2);

    }
}

class Family{
    public void member(int m, int n){
     int sum = m+n;
     System.out.println(sum);
    }

    public void member(int m,int n,int o, int p){
        int sum = m+n+o+p;
        System.out.println(sum);
    }

}
