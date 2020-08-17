package PolymorphismBasic;

public class OverridingExample1 {

    public static void display(){
        Dog  d1 = new Dog();
        d1.makeSound();

        Cat c1 = new Cat();
        c1.makeSound();

        Tiger t1 = new Tiger();
        t1.makeSound();
    }
}


class Animal {
    public void makeSound(){
        System.out.println("Animal can make sound");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Bark bark..");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Meow meow..");
    }
}

class Tiger extends Animal {

    public void move() {
        System.out.println("Tiger can move first");
    }
}
