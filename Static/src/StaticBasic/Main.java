package StaticBasic;

public class Main {

    public static void main(String[] args) {







        // If we want to access class members without creating an instance of the class, we need to declare the class members static.
        // Static methods are also called class methods. It is because a static method belongs to the class rather than the object of a class.
        // We can invoke static methods directly using the class name.
        // We can call static methods and attributes from anywhere (inside package or another package). Just it depends on public modifiers.

        // if we declare a variable static, all objects of the class share the same static variable.


// For Example:

        // The Math class in Java has almost all of its members static.
        // So, we can access its members without creating instances of the Math class.
        // It is possible because the methods and variables of the Math class are static.
                // Math.PI, Math.abs(-12), Math.pow(2,2)


        // In every Java program, we have declared the main method static.
        // It is because to run the program the JVM should be able to invoke the main method during the initial phase where no objects exist in the memory.

    }
}
