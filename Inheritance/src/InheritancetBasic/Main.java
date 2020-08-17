package InheritancetBasic;

public class Main {

    public static void main(String[] args) {
        InheritanceExample1.display();



// Basic:
        // Inheritance allows us to derive a new class (subclass) from an existing class (superclass).
        // The subclass inherits the attributes and methods of the superclass.
        //  we use the extends keyword to inherit from a class.

        // Animal is the superclass (parent class or base class).
        // Tiger, Dog, Monkey is a subclass (child class or derived class).
        // The subclass inherits the fields and methods of the superclass.


// Type of Inheritance:
        // Single inheritance -------- Class B extends from class A only.
        // Multilevel inheritance ---- Class B extends from class A; then class C extends from class B.
        // Hierarchical inheritance -- Class A acts as the superclass for classes B, C, and D.

        // Multiple inheritance ------ Class C extends from interfaces A and B.
        // Hybrid inheritance -------- Mix of two or more types of inheritance.

        // Note:
                // Java doesn’t support multiple and hybrid inheritance through classes.
                // However, we can achieve multiple inheritance in Java through interfaces.


// Access Modifiers:

        // Access Modifier ---- within class ---- within package ---- outside package by (subclass only) ----	outside package
        // Private  ---------------- Y -------------- N -------------------------- N ----------------------------- N
        // Default	---------------- Y -------------- Y	-------------------------- N ----------------------------- N
        // Protected --------------- Y -------------- Y	-------------------------- Y ----------------------------- N
        // Public ------------------ Y -------------- Y	-------------------------- Y ----------------------------- Y





    }
}
