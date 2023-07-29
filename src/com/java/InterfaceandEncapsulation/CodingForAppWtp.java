package com.java.InterfaceandEncapsulation;

import java.util.Scanner;

public class CodingForAppWtp implements AppWhatsapp{

    Encapsulation valueset=new Encapsulation();
    @Override
    public void userProfile() {
        Scanner sv=new Scanner(System.in);

        System.out.println("Enter id : ");
        int userId=sv.nextInt();
        valueset.putUserId(userId);

        System.out.println("Enter name here : ");
        String username=sv.next();
        valueset.putUserName(username);

        System.out.println("Enter bio here : ");
        String userBio=sv.next();
        valueset.putUserBio(userBio);

        System.out.println("Enter mobile no. here : ");
        String userMobile=sv.next();
        valueset.putMobile(userMobile);
    }

    @Override
    public void viewProfile() {
        int userId = valueset.getUserId();
        System.out.println("User id : "+userId);
        String username=valueset.getUsername();
        System.out.println("User name : "+username);
        String mobile = valueset.getMobile();
        System.out.println("Mobile : "+mobile);
        String userbio = valueset.getUserbio();
        System.out.println("Bio : "+userbio);
    }
}
