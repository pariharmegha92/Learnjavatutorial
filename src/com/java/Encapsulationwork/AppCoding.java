package com.java.Encapsulationwork;

public class AppCoding implements InstagramApp {

    Encapsulation2 object = new Encapsulation2();


    @Override
    public void userprofile() {
        object.putUsername("kajal");
        object.putbio("kajal is a good girl!!");
        object.putmobile("8965093534");

    }

    public void showprofile() {
        String username = object.getusername();
        System.out.println("User name " + username);
        String mobile = object.getMobile();
        System.out.println("Mobile : " + mobile);
        String userbio = object.getUserbio();
        System.out.println("Bio : " + userbio);

    }

}


