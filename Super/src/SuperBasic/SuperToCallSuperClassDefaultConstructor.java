package SuperBasic;

public class SuperToCallSuperClassDefaultConstructor {

    public static void display(){
        Dog3 dog1 = new Dog3();
    }
}

////////////////////////////////////////////////////////////////////////////////////////////////

class Animal3 {

    Animal3() {
        System.out.println("I am an animal");
    }

    Animal3(String name) {
        System.out.println("Name: " + name);
    }
}

class Dog3 extends Animal3 {

    Dog3() {
        // put empty or call super()  to call superclass constructor
        // super();

        System.out.println("I am a dog");
    }
}
