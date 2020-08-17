package javaBasic;

public class Variable {


// Variable Basic:

        // A variable is a location in memory (storage area) to hold data.
        // We can declare variables with or without assigning the value.
        // All variables must be declared before they can be used.
        // Before calling or using the variable we must need to assign the variable's value.
        // Variable name must be unique.
        // We cannot change the data type of a variable in Java within the same scope.

        // Variable name first letter can be a letter or $ or _ only.
        // After first letter it can be any letters or $ or _ or digits.

        // Best way to write a variable name: myFirstVariableName or studentLastName or previousMonthSalary


// Types of variables:

        // There are 4 types of variables in Java programming language:
                // Instance Variables (Non-Static Fields)
                // Class Variables (Static Fields)
                // Local Variables
                // Parameters


// Java Data Type:
        // There are 2 kinds of data types. These are
                // Primitive Data type
                        // boolean
                        // byte
                        // char
                        // short
                        // int
                        // long
                        // float
                        // double

                // Non-Primitive Data type.
                        // String
                        // Array
                        // Class
                        // Interface


// 8 Primitive Data Types:

        // boolean:
                // The boolean data type has two possible values, either true or false.
                // They are usually used for true/false conditions.
                // Default value: false.

                // boolean flag = true;


        // byte:
                // The byte data type can have values from -128 to 127 (8-bit signed two's complement integer).
                // It's used instead of int or other integer data types to save memory if it's certain that the value of a variable will be within [-128, 127].
                // Default value: 0

                // byte range = 124;


        // char:
                // It's a 16-bit Unicode character.
                // The minimum value of the char data type is '\u0000' (0). The maximum value of the char data type is '\uffff'.
                // Default value: '\u0000'

                // char letter = '\u0051';
                // char letter1 = '9';
                // char letter2 = 65;


        // short:
                // The short data type can have values from -32768 to 32767 (16-bit signed two's complement integer).
                // It's used instead of other integer data types to save memory if it's certain that the value of the variable will be within [-32768, 32767].
                // Default value: 0

                // short temperature = -200;


        // int:
                // The int data type can have values from -2^31 to 2^31 - 1 (32-bit signed two's complement integer).
                // If you are using Java 8 or later, you can use unsigned 32-bit integer with a minimum value of 0 and a maximum value of 2^32 - 1.
                // Default value: 0

                // int range = -4250000;


        // long:
                // The long data type can have values from -2^63 to 2^63 - 1 (64-bit signed two's complement integer).
                // If you are using Java 8 or later, you can use unsigned 64-bit integer with a minimum value of 0 and a maximum value of 2^64 - 1.
                // Default value: 0

                // long range = -42332200000L;


        // float:
                // The float data type is a single-precision 32-bit floating-point.
                // It should never be used for precise values such as currency.
                // Default value: 0.0 (0.0f)

                // float number = -42.3f;


        // double:
                // The double data type is a double-precision 64-bit floating-point.
                // It should never be used for precise values such as currency.
                // Default value: 0.0 (0.0d)

                // double number = -45442.3545d;


// Variable type:
        // Local Variable
                //A variable declared inside the body of the method is called local variable.
                // You can use this variable only within that method and the other methods in the class aren't even aware that the variable exists.
                //A local variable cannot be defined with "static" keyword.

        // Instance Variable
                //A variable declared inside the class but outside the body of the method, is called instance variable. It is not declared as static.
                //It is called instance variable because its value is instance specific and is not shared among instances.

        // Static variable
                //A variable which is declared as static is called static variable.
                // It cannot be local.
                // You can create a single copy of static variable and share among all the instances of the class.
                // Memory allocation for static variable happens only once when the class is loaded in the memory.

    // Example:

            // class A{
            //     int data=50;          //instance variable
            //     static int m=100;     //static variable

            //     void method(){
            //         int n=90;        //local variable
            //     }
            // }



// Difference between Primitive and Class data type:
        // A Java both int and Integer are used to store integer type data the major difference between both is type of int is primitive while Integer is of class type.

            // Primitive type ------ Class type(java.lang)
                // boolean ------------ Boolean
                // byte --------------- Byte
                // char --------------- Character
                // short -------------- Short
                // int ---------------- Integer
                // long --------------- Long
                // float -------------- Float
                // double ------------- Double

            // String and Array are already class type.

        // With List, Set, Stack or map we must need to use Class type. Primitive type is not acceptable there.
}

