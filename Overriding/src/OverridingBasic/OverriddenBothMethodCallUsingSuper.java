package OverridingBasic;

// By using super keyword we can call both(superclass & subclass) overridden methods.

public class OverriddenBothMethodCallUsingSuper {

    public static void display(){
        Dog1 d1 = new Dog1();
        d1.displayInfo();
    }
}

///////////////////////////////////////////////////////////////////////////////

class Animal1 {
    public void displayInfo() {
        System.out.println("I am an animal.");
    }
}


class Dog1 extends Animal1 {
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("I am a dog.");
    }
}