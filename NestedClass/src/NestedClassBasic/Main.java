package NestedClassBasic;

public class Main {

    public static void main(String[] args) {

        InnerClassExample.display();
        InnerClassUsingThisKeyword.display();
        StaticNeastedClassExample.display();




// Nested Class basic:

        // We can define a class within another class. Such class is known as nested class
        // Since inner classes are members of the outer class, you can apply any access modifiers like private, protected to your inner class which is not possible in normal classes.
        // Since the nested class is a member of its enclosing outer class, you can use the dot (.) notation to access the nested class and its members.



// Two types of Nested Class are:
        // Non-static nested class or (inner class)
                // A non-static nested class is a class within another class.
                // Since the inner class exists within the outer class, you must instantiate the outer class first, in order to instantiate the inner class.
                // Java treats the inner class as a regular member of a class. They are just like methods and variables declared inside a class.
                // Non-static nested classes (inner classes) have access to other members of the outer/enclosing class, even if they are declared private.

        // Static nested class
                // a static nested class cannot access the member variables of the outer class.
                // It is because the static nested class doesn't require you to create an instance of the outer class.




    }
}
