package InterfaceBasic;

public class Main {

    public static void main(String[] args) {





// Why we use Interface:
        // 1. to achieve abstraction.
        // 2. for multiple inheritance.


// Interface Basic:

        // We can not create object from interface class. Like abstract class.
        // Interface provides total abstraction; means all the methods in an interface are declared with the empty body.
        // All of the methods in an interface are abstract.
        // interfaces do not have any non-abstract methods.
        // An interface is declared by using the interface keyword.
        // For implementation subclass use implements keyword.
        // Subclass should override all the abstract methods declared in the interface

        // An interface cannot contain a constructor.
        // Interface cannot be declared as private, protected or transient. only public can ====> (public interface)
        // Interface methods are by default abstract and public =======> (public abstract)
        // Interface attributes are by default public, static and final ========> (public static final)

        // A class can implement any number of interfaces.
        // If there are two or more same methods in two interfaces and a class implements both interfaces, implementation of the method once is enough.
        // A class cannot implement two interfaces that have methods with same name but different return type. It will show errors.



// The relationship between classes and interfaces:
        // class & class ===========> extends
        // interface & class =======> implements
        // interface & interface ===> extends




// If we write that:
        // interface Printable{             // or public interface Printable{}
        //      int value = 4;              // or pubic int value=4;
        //      void print();               // or public void print();
        // }

// Compiler will see that:
        // public interface Printable{
        //      public static final int value = 4;
        //      public abstract void print();
        // }


    }
}
