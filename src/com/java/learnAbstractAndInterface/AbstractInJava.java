package com.java.learnAbstractAndInterface;

public class AbstractInJava {
    public static void main(String[] args) {
        AccessInstagram instagram=new AccessInstagram();
        instagram.post();
        instagram.reels();
        instagram.sends();
    }
}
abstract class AppInstagram{
  public abstract void reels();
  public abstract void post();
  public abstract void sends();
}
 class AccessInstagram extends AppInstagram{
    public void reels(){
        System.out.println("this is reels section...");
    }
    public void post(){
        System.out.println("this is post section...");
    }
    public void sends(){
        System.out.println("this is send section...");
    }
}
