package javaBasic;

public class BasicLevel1 {


// Part: 1
//=======================================================================================================================================================================

    // Every valid Java Application must have a class definition (that matches the filename).
    // The main method and other methods must be inside the class definition.
    // The compiler executes the codes starting from the main function.

    // When a function is called inside a class it's calls methods.


// Part: 2
// =======================================================================================================================================================================

                //                Compiler                JVM                     CPU
                // Java Program ============> Bytecode =========> Machine Code =========> Output


    // jDK: =============> JRE + Compiler + JavaDoc + Debugger
            // JDK (Java Development Kit) is a software development kit required to develop applications in Java.
            // In addition to JRE, JDK also contains a number of development tools (compilers, JavaDoc, Java Debugger, etc).
            // When you download JDK, JRE is also downloaded with it.


    // JRE:  =============> JVM + Class Libraries + Other Components
            // JRE (Java Runtime Environment) is a software package that provides Java class libraries, Java Virtual Machine (JVM), and other components
            // that are required to run Java applications.


    // JVM:
            // JVM (Java Virtual Machine) is an abstract machine that enables your computer to run a Java program.

            // Java is a platform-independent language. It's because when you write Java code, it's ultimately written for JVM but not your physical machine (computer).
            // Since JVM ​executes the Java bytecode which is platform-independent, Java is platform-independent.


    // Package:
            // A package is simply a container that groups related types (Java classes, interfaces, enumerations, and annotations).

            // 2 types of packages are:
                    // Built in Package
                    // User-defined Package

            // Package & Class Example:
                    // java.lang
                            // Object
                            // String
                            // Math
                    // java.util
                            // ArrayList
                            // LinkedList
                            // TreeSet
                            // HashMap
                    // java.io
                            // BufferedWritter
                            // BufferedReader


// Part: 3
//======================================================================================================================================================================

    // Identifier:
            // Identifiers are the name given to variables, classes, methods, etc.
            // To indicate the storage area, each variable, class or method should be given a unique name (identifier).


    // Literal:
            // Any value which can be assigned to the variable is called as literal/constant.

                    // boolean literal:
                            // boolean flag = false;
                                // here false is literal.

                    // long literal:
                            // long myLong = 3434L;
                                // here L is for long literal

                    // float:
                            // float myFloat = 34.34f;
                                // here f is the float literal.
                                // If you don't put f, it will be consider as double.

                    // double:
                            // double myDouble = 4343.45d;     or   double myDouble = 4343.45;

                    // char:
                            // char myChar = 'c';        // single quotation
                            // char ch = '\u0061';       // single quotation
                            // char myChar = 45;
                            // char ch = '\n';           // single

                    // String:
                            // String myStr = "Java";     // double quotation.



}
