package com.java.encapsulation;

public class LearnEncapsulation {
    public static void main(String[] args) {
        EntitiesClass accessEntites=new EntitiesClass();
        accessEntites.setUname("Megha");
        accessEntites.setMobile("7787780983");

        String name=accessEntites.getUname();
        System.out.println(name);
        System.out.println(accessEntites.getUname()+" "+accessEntites.getMobile());
    }
}
