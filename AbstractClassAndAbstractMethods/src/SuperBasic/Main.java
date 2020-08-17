package SuperBasic;

public class Main {

    public static void main(String[] args) {

        Example1.display();





// Abstract Basic:
        // Data abstraction is the process of hiding certain details and showing only essential information to the user.
        // Abstraction can be achieved with either abstract classes or interfaces.

        // Every animal can make sound, But everyone differently.
        // Dog makes its own implementation of makeSound() and Cat makes its own implementation of makeSound().
        // For applying this idea we need to use Abstract Class and Abstract Methods.

        // Abstract class is mostly similar as normal class. Except:-
                // 1. we can't create object from abstract class.
                // 2. Abstract classes may or may not contain abstract methods. Abstract methods can't have any method body(only declaration).
                // 3. Others all things are similar with normal class.


// Java Abstract Class:
        // A class which is declared with the abstract keyword is known as an abstract class in Java.
        // We use the abstract keyword to create abstract classes and methods.
        // Abstract classes may or may not contain abstract methods. Abstract methods can't have any method body(only declaration).
        // a class can be declared abstract even if it does not contain any abstract methods.
        // if a class has at least one abstract method, then the class must be declared abstract.
        // We cannot create objects of an abstract class.
        // To implement features of an abstract class, we inherit subclasses from it and create objects of the subclass.
        // A subclass must override all abstract methods of an abstract class.
        // However, if the subclass is declared abstract, it's not mandatory to override abstract methods.
        // Abstract class can have data member, abstract method, non-abstract method, constructor,, static methods, final method, and even main() method.
        // We can access the static attributes and methods of an abstract class using the reference of the abstract class.

        // we can access the constructor of an abstract class from the subclass using the super keyword.


// Java Abstract Method:
        // We use the abstract keyword to create abstract classes and methods.
        // An abstract method doesn't have any implementation (method body). The body is provided by the subclass overridden abstract method.
        // only an abstract class can contain abstract methods.

    }
}
