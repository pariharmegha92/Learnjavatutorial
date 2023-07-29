package com.java.learnAbstractAndInterface;

public class InterfaceInJava {
    public static void main(String[] args) {
        AccessWhatsApp accessWhatsApp = new AccessWhatsApp();
        accessWhatsApp.message();

        int amount = accessWhatsApp.amount(100000);
        String s = accessWhatsApp.messagePayment();
        System.out.println(s);
    }
}

interface AppWhatsapp {
    int a = 100;//bydefault public final

    public void message();//bydefault public+abstract

    void status();


    //
    //
}

interface AppPayment{
    int amount(int a);
    String messagePayment();
}
interface AppLocation extends AppWhatsapp{
    String liveLocation();

}

class AccessWhatsApp implements AppLocation,AppPayment{
    int b = 10;

    public String liveLocation(){
        return " ";
    }

    @Override
    public void message() {
        int sum = a + b;
        System.out.println(sum);
    }

    @Override
    public void status() {

    }

    @Override
    public int amount(int a) {
        return a;
    }

    @Override
    public String messagePayment() {
        return "amount credit 100,00000 your account xxxx xxxx xxxx 2023 " +
                "Date 2/20/2023";
    }
}

