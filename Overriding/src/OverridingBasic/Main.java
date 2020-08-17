package OverridingBasic;

public class Main {

    public static void main(String[] args) {

        OverridingExample1.display();
        OverriddenBothMethodCallUsingSuper.display();
        OverriddenWithDifferentAccessSpecifiers.display();



        // if the same method is defined in both the superclass class and the subclass class,
        // then the method of the subclass class overrides the method of the superclass. This is known as method overriding.

        // the @Override annotation specifies the compiler that the method after this annotation overrides the method of the superclass.
        // It is not mandatory to use @Override.


// Overriding Rules:
        // Both the superclass and the subclass must have the same method name, the same return type and the same parameter list.
        // superclass Access specifier can't be private. only possible (public, protected, default).
        // We cannot override the method declared as final and static.
        // We should always override abstract methods of the superclass
    }
}
