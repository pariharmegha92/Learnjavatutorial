package com.java.practiceEncapsulation;

public class OuterClass {
    private String name;
    private String email;

    public OuterClass(){

    }
    public void setName(String name){
        this.name=name;
    }
    public void setEmail(String email){
        this.email=email;

    }
    public String getName() {
        System.out.println("get the name !");
        return name;
    }
    public String getEmail(){
        System.out.println("get email id!!");
        return email;

    }

}





