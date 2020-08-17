package udemySection03;

// Java SE(Standard Edition) >> Java Applet >> Client Side
// Java EE(Enterprise Edition) >> Java Servlet >> Server Side

// JRE (Java Runtime Environment)
        // combination of JVM (Java Virtual Machine) and Libraries.
// JDK (Java Development Kit)
        // combination of JRE and Development tools.
                // Development tool has Debug, compiler, JavaDoc.

public class Main {    // Class name's first char should be written in UpperCase.

    public static void main(String[] args) {

        // comments:
        // This is single line comment.

        /*
         * This is multiple
         * line comment
         * */

// Global variables are not technically allowed in Java.  A static variable can be declared, which can be available to all instances of a class.

// Identifier: Identifier refers to the unique name for each variable, method and class.

// Attribute or Field: Inside class any variable is called attribute.
        //int myInt = 34;  (data type, variable name and value) these 3 things are the component of attribute or field.

// Data type: (two types)
        //Primitive (fixed memory allocation) => int, char, boolean, short, long, float, double
        // Non-primitive (Not fixed memory size) => String, array, class


// Data Type Casting: (2 types)
        // Widening: (automatic) byte -> short -> char -> int -> long -> float -> double
            // int myInt = 99;
            // double myDouble = myInt;

        // Narrowing: (manual)   double -> float -> long -> int -> char -> short -> byte
            // double myDouble = 3.141598d;
            // int myInt = (int) myDouble;

// Special Character:
        // for printing (' or " or \) we must need to use backslash (\)
            // Example: \' or \" or \\

        // \n =====> for newline
        // \t =====> for tab
        // \\u =====> for unicode    (example: \u0044)

        // single line comment : //
        // multiple line comment: /**/

// Operator, Operands:
        // int result = (10 * inputValue) - 50;
            // =, * and - is Operator.
            // 10, inputValue and 50 are operands.
            // (result = (10 * inputValue) - 50) is totally called expression. only data type and semicolon are not included in expression.
                // reserved keyword and semicolon is not included in expression.

        // Assignment Operators: (When = is applied) with itself
                // ( = , += , -= , *= , /= , %= , &= , |= , ^=)
        // Comparison Operators: ( == , != , > , < , >= , <=)
        // Logical Operators: ( && , || , ! , ^ )

// Expression: Expression is the combination of operators and operands(variables, values). And anything inside parenthesis is calls Expression.
        // int result = (10 * inputValue) - 50;
            // result = (10 * inputValue) - 50 is calls expression. reserved keyword and semicolon is not included in expression.
        // if(age == 20){}
            // inside parenthesis (age == 20) is the expression.
        // System.out.println("Hello I am Hossain Md Tuhin");
            // inside parenthesis ("Hello I am Hossain Md Tuhin") is calls expression.
        // System.out.println(result);
            // inside parenthesis (result) is calls expression.

// Statement: Keyword is the combination of operators, operands(variables, values) and reserved keyword. Statement ends with semicolon.
        // int result = (10 * inputValue) - 50;
            // int result = (10 * inputValue) - 50; is totally calls statement.
        // if(age == 20){}             ----------- if else block statement
            // if(age == 20){} is totally calls statement.
        // System.out.println("Hello I am Hossain Md Tuhin");
            // System.out.println("Hello I am Hossain Md Tuhin"); is totally calls statement.

// Code Block: A block is a piece of Java program text that is executed as a unit. Block range is { }
        // if(age == 20){                start of the block
        //      print(name)
        // }                             end of the block

//break and continue:
        // inside switch case we can use break
        // inside loop(for, while, do-while) we can use break and continue both, by using if statement.

// Method: (When function is called inside class.)
    // 2 types: instance methods and static methods

        /*
         * public class MyClass{
         *   public static void main(String[] args) {
         *      myMethod("Liam");
         *      myMethod("Jenny");
         *      myMethod("Anja");
         *   }
         *
         *   static void myMethod(String fname) {
         *       System.out.println(fname + " Refsnes");
         *   }
         *
         * }
         */

        // After method name, inside parenthesis (int a, string b) is called parameter. Two parameters are a and b.
        // When a parameter is passed to the method, it is called an argument.
        // So, from the example above: fname is a parameter, while Liam, Jenny and Anja are arguments.


// For myMethod:
          // static means that the method belongs to the MyClass class and not an object of the MyClass class.

// Static:
        // Static refers to no need to create object, Just call it using class name
        // The memory allocation is fixed for static variables or methods.
        // static methods can access only static variable or methods (same or other class)
        // static methods can't use this keyword. It use class name.

//Instance or Non-Static:
        // to call any non-static methods, we must need to create a new object of this class.
        // The memory allocation is not fixed for non-static variables or methods.
        // non-static method can access static and non-static both variables and methods (same or other class)


// Method Overloading:
        // With method overloading, multiple methods can have the same name with different parameters.


// Access Modifiers: (same class -> same package subclass -> same package non-subclass -> different package subclass -> different package non-subclass
        // public: Can access everywhere.
        // default: Only accessible inside same package.
        // protected: Can access everywhere, Only can't accessible inside (different package non-subclass)
        // private: Only accessible inside same class.


// Class => one class to so many objects or instances => one object to so many references

    // Class:
            // Class is the blueprint for objects.

    // Instance or Object:
            //  Instance or Object is same. It creates when we use new keyword.

    // Reference:
            // Reference is an memory address that indicates an object's variable and methods are stored.


            // House blueHouse = new House("Blue");
            // House anotherHouse = blueHouse;
            // House greenHouse = new House("Green");
        // total class: 1
        // total instance or object: 2
        // total reference: 3

// Class and Object:
        // Person sally = new Person();

        // Person => name of class
        // sally => object name
        // new => allocate memory
        // Person() => constructor


// Inheritance vs Composition:
        // When two classes some variables are similar ===> Inheritance
                // Animal ==> Human ==> Dog ==> Cat ==> Cow
        // When two classes have no similar variable ======> Composition
                // Computer ==> MotherBoard ==> Monitor ==> Keyboard

// Encapsulation: ?????????????

// Polymorphism:  ?????????????

// Inheritance: ?????????????

// Abstraction: ?????????????
    }

}

