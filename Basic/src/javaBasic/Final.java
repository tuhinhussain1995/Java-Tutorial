package javaBasic;

public class Final {

// final basic:

        // final keyword is used to denote constants.
        // It can be used with variables, methods, and classes.

        // Once any entity (variable, method or class) is declared final, it can be assigned only once.



// final rules:

        // the final variable cannot be reinitialized with another value
                // class Main {
                //  public static void main(String[] args) {
                //
                //    final int AGE = 32;
                //    AGE = 45;             // We can't reassign the value. Because AGE is final.
                //  }
                // }

        // the final method cannot be overridden by the child class.
                // class FinalDemo {
                //    public final void display() {
                //      System.out.println("This is a final method.");
                //    }
                // }
                //
                //class Main extends FinalDemo {
                //
                //  public final void display() {                             // We can't override final method.
                //    System.out.println("The final method is overridden.");
                //  }
                //
                //  public static void main(String[] args) {
                //    Main obj = new Main();
                //    obj.display();
                //  }
                // }

        // the final class cannot be extended
                // final class FinalClass {
                //    public void display() {
                //      System.out.println("This is a final method.");
                //    }
                // }
                //
                //class Main extends FinalClass {             //  final class cannot be inherited by another class.
                //  public static void main(String[] args) {
                //    Main obj = new Main();
                //    obj.display();
                //  }
                // }


}
