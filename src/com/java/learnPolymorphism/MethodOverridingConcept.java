package com.java.learnPolymorphism;

public class MethodOverridingConcept {
    public static void main(String[] args) {

        //person1
        Megha megha1;
        megha1 = new HomeNature();
        megha1.nature();

        //person 2
        Megha megha2;
        megha2=new OfficeNature();
        megha2.nature();

    }
}

//Run time polymorphism - method overriding
class Megha {
    public void nature() {
        System.out.println("In collage");
    }
}

class HomeNature extends Megha {
    public void nature() {
        System.out.println("In home");
    }
}

class OfficeNature extends Megha {
    public void nature() {
        System.out.println("In Office");
    }
}
