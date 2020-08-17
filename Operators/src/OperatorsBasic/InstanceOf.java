package OperatorsBasic;

import java.util.ArrayList;
import java.util.Arrays;

        // instanceof keyword is a binary operator. It is used to check whether an object is an instance of a particular class or not.

        // result = objectName instanceof className;

public class InstanceOf {

// With InstanceOf we can use only Class data type. Not allowed primitive data type.

    public static void display2(){

        Boolean myBoolean = true;
        Byte myByte = 34;
        Character myChar = 'c';
        Short myShort = 343;
        Integer myInt = 22;
        Long myLong = 43434L;
        Float myFloat = 343.34f;
        Double myDouble = 356.534d;

        String myString = "Programiz";


        System.out.println("Is name an instance of String: "+ (myBoolean instanceof Boolean));
        System.out.println("Is age an instance of Integer: "+ (myByte instanceof Byte));
        System.out.println("Is name an instance of String: "+ (myChar instanceof Character));
        System.out.println("Is age an instance of Integer: "+ (myShort instanceof Short));
        System.out.println("Is name an instance of String: "+ (myInt instanceof Integer));
        System.out.println("Is age an instance of Integer: "+ (myLong instanceof Long));
        System.out.println("Is name an instance of String: "+ (myFloat instanceof Float));
        System.out.println("Is age an instance of Integer: "+ (myDouble instanceof Double));
        System.out.println("Is name an instance of String: "+ (myString instanceof String));

    }


    public static void display(){

        ArrayList myArray = new ArrayList(Arrays.asList(34, "Tuhin", 3.1416f, true, 53.233d));

        for(java.lang.Object x : myArray){
            System.out.print(x.getClass() + " =====> ");
            System.out.println(x instanceof Double);
        }
    }


// instanceof operator is used to check whether an object of a subclass is also an instance of the superclass.


    public static void display1(){
        Person obj1 = new Person();
        Person obj2 = new Boy();                        // Upcasting

        System.out.println(obj1 instanceof Person);
        System.out.println(obj1 instanceof Boy);
        System.out.println(obj1 instanceof MyInterface);

        System.out.println(obj2 instanceof Person);
        System.out.println(obj2 instanceof Boy);
        System.out.println(obj2 instanceof MyInterface);


        Boy b1 = new Boy();
        Boy b2 = (Boy) obj2;                            // Downcasting

                // In the case of downcasting, an object of the superclass is treated as an object of the subclass.

        System.out.println(b1 instanceof Person);
        System.out.println(b1 instanceof Boy);
        System.out.println(b1 instanceof MyInterface);

        System.out.println(b2 instanceof Person);
        System.out.println(b2 instanceof Boy);
        System.out.println(b2 instanceof MyInterface);
    }
}

class Person {
}

class Boy extends Person implements MyInterface {
}

interface MyInterface {
}
