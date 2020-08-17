package OverridingBasic;

public class OverriddenWithDifferentAccessSpecifiers {

    public static void display(){
        Dog2 d1 = new Dog2();
        d1.displayInfo();
    }
}

/////////////////////////////////////////////////////////////////////////////////////////////

class Animal2 {
    protected void displayInfo() {
        System.out.println("I am an animal.");
    }
}


class Dog2 extends Animal2 {
    @Override
    public void displayInfo() {
        System.out.println("I am a dog.");
    }
}


        // Notice that, the displayInfo() is declared protected in the Animal superclass.
        // The same method has the public access specifier in the Dog subclass.
        // This is possible because the public provides larger access than the protected.
