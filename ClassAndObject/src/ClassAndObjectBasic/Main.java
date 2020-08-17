package ClassAndObjectBasic;

public class Main {

    public static void main(String[] args) {

        ClassAndObjectExample1.display();





// Class:
        // A class is a blueprint for the object. Before you create objects in Java, you need to define a class.
        // Class access modifier must be public.
        // We can create one class object from anywhere(inside same class, another class, same package or another package). Because Class Access modifier is always Public.

        // if we create a new class inside another class, the new class access modifiers must be default.
        // For this, created new class only accessible inside same package. Outside package not possible to access.


// Object:
        // An object is called an instance of a class.
        // Objects are used to access members of the class. We can access members by using the . operator.
        // Object's member accessibility depends on members(variables, methods) access modifiers.

                // private -------- same class
                // default -------- same class, same package
                // protected ------ same class, same package, different package(subclass only)
                // public --------- same class, same package, different package

                // static --------- same class, same package, different package (only by using class name, no need to create object)


// Example:

        // class Lamp {
        //
        //   private boolean isOn;              // instance variable
        //
        //   public void turnOn() {             // method
        //     isOn = true;
        //   }
        //
        //   public void turnOff() {            // method
        //   	isOn = false;
        //   }
        // }


// Constructor:
        // A constructor has the same name as that of class and it does not return any value. Constructor return type is void.
        // By default constructor access modifier is default.
        // constructor access modifier can be (public, protected, default, private).


// Java is an object-oriented programming language. Objects share two characteristics:
        // state (fields)
        // behavior (methods)

        // For Example:
                // Bicycle is an object
                // States: current gear, two wheels, number of gear, etc
                // Behavior: braking, accelerating, changing gears, etc




    }
}


