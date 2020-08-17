package SuperBasic;

public class SuperToCallSuperClassParameterizeConstructor {

    public static void display(){
        Dog dog1 = new Dog();
    }
}

////////////////////////////////////////////////////////////////////////////////////////////////

class Animal {

    Animal() {
        System.out.println("I am an animal");
    }

    Animal(String type) {
        System.out.println("Type: "+type);
    }

    Animal(String type, int age){
        System.out.println("Type: " + type + " ==> Name: " + age);
    }
}

class Dog extends Animal {

    Dog() {
                // only possible to call one super constructor at a time.
        super("Animal");    // or super() or super("Animal", 32)

        System.out.println("I am a dog");
    }
}
