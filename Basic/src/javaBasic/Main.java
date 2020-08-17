package javaBasic;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        javaLangObject();
        extraInfo();
        instanceOf();
        ternaryOperator();
        Recursion.display();
    }


    public static void javaLangObject(){
        java.lang.Object myVariable;

        myVariable = 34;
        System.out.println(myVariable);
        System.out.println(myVariable.getClass());

        myVariable = "Tuhin";
        System.out.println(myVariable);
        System.out.println(myVariable.getClass());

        myVariable = 3.1416f;
        System.out.println(myVariable);
        System.out.println(myVariable.getClass());

        myVariable = true;
        System.out.println(myVariable);
        System.out.println(myVariable.getClass());
    }


    public static void extraInfo(){
        int number1 = 5, number2 = 6, number3=33;
        System.out.println(number1+number2+number3);

        char letter = '\u0051';
        char letter1 = '9';
        char letter2 = 65;
    }


    public static void instanceOf(){
        String test = "asdf";
        boolean result;

        result = test instanceof String;
        System.out.println(result);


        ArrayList myArray = new ArrayList(Arrays.asList(34, "Tuhin", 3.1416f, true, 53.233d));

        for(java.lang.Object x : myArray){
            System.out.println(x instanceof Double);
        }
    }


    public static void ternaryOperator(){
        int februaryDays = 29;
        String res;

        res =  (februaryDays == 28) ? "Not a leap year" : "Leap year";
        System.out.println(res);

        System.out.println((februaryDays == 28) ? "Not a leap year" : "Leap year");



        int a = 20, b = 10, c = 30, result;

        result = ((a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c));
        System.out.println("Max of three numbers = " + result);
    }

}
