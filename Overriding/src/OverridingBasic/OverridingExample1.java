package OverridingBasic;

public class OverridingExample1 {

    public static void display(){
        Dog d1 = new Dog();
        d1.displayInfo();
    }

}

//////////////////////////////////////////////////////////////////////////

class Animal {
    public void displayInfo() {
        System.out.println("I am an animal.");
    }
}


class Dog extends Animal {
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("I am a dog.");
    }
}
