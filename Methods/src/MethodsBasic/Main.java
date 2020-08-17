package MethodsBasic;

public class Main {

    public static void main(String[] args) {

        MethodsExample1.example1();
        MethodsExample1.example2();
        MethodsExample1.example3();
        MethodsExample1.example4();
        MethodsExample1.example5();
        MethodsExample1.example6();




// Method & Function:

        // When a function is called inside the class is called method.

        // function is a block of code that performs a specific task.
        // Methods are bound to a class and they define the behavior of a class.

        // two types of methods in Java:
                // Standard Library Methods
                // User-defined Methods


// static vs void:

        // static - It means that the method can be accessed without any objects.
        // void - It means that the method does not return any value. We will learn more about this later in this tutorial.


// parameter & method body:

        // parameters (arguments) - These are values passed to a method. We can pass any number of arguments to a method.
        // method body - It includes the programming statements that are used to perform some tasks. The method body is enclosed inside the curly braces { }.


// 4 type of access modifiers are: used with (classes, interfaces, variables, methods)

        // Private ========> visible within the same class only
                // In order to access the variable from the outer class, we have used methods: getName() and setName(). These methods are called getter and setter in Java.
                // setter method (setName()) to assign value to the variable.
                // getter method (getName()) to access the variable.

        // Default ========> visible only within the same class or same package only
        // If we do not explicitly specify any access modifier for classes, methods, variables, etc, then it is considered as default access modifier.

        // Protected ======> visible within the same class or same package or all subclasses(outside package also).


        // Public =========> visible everywhere
    }
}
