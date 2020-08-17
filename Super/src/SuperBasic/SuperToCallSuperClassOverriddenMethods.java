package SuperBasic;

public class SuperToCallSuperClassOverriddenMethods {

    public static void display(){
        Dog2 dog1 = new Dog2();
        dog1.printMessage();
    }
}

/////////////////////////////////////////////////////////////////////////////////////

class Animal2 {
    public void display(){
        System.out.println("I am an animal");
    }
}

class Dog2 extends Animal2 {
    @Override
    public void display(){
        System.out.println("I am a dog");
    }

    public void printMessage(){
        display();
        super.display();
    }
}