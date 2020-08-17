package ConstructorBasic;

public class Main {

    public static void main(String[] args) {
        NonArgConstructor.display();
        DefaultConstructor.display();
        ParameterizedConstructor.display();
        ConstructorsOverloading.display();
        RelationBetweenSuperAndSubClassConstructor.display();




// Constructor Basic:

        // A constructor has the same name as that of class and it does not return any value. Constructor return type is void.
        // By default constructor access modifier is default. only accessible within same package.
        // constructor access modifier can be (public, protected, default, private).

        // In Java, every class has its constructor that is invoked automatically when an object of the class is created.
        // constructor is called while we creating object.
        // If a class doesn't have a constructor, the Java compiler automatically creates a default constructor during run-time.
        // A constructor is similar to a method but in actual, it is not a method.
        // A constructor cannot be abstract or static or final.
        // A constructor can be overloaded but can not be overridden.

                // private -------- same class
                // default -------- same class, same package
                // protected ------ same class, same package, different package(subclass only)
                // public --------- same class, same package, different package


// Types of Constructor
        // No-Arg Constructor : If a constructor does not accept any parameters, it is known as a no-arg constructor.
        // Default Constructor : If you do not create any constructors, the Java compiler will automatically create a no-argument constructor during run-time. This constructor is known as the default constructor.
        // Parameterized Constructor : When we pass parameters to a constructor, it calls Parameterized Constructor.


// The default constructor initializes any uninitialized instance variables with default values.
        // Default Array values.
                // boolean ----------- false
                // byte -------------- 0
                // short ------------- 0
                // int --------------- 0
                // long -------------- 0L
                // char -------------- \u0000
                // float ------------- 0.0f
                // double ------------ 0.0d
                // String ------------ null
                // bject ------------- Reference null




    }
}
