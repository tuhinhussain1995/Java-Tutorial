package com.company;

public class Main {

    public static void main(String[] args) {
// Operator:
        // int result = (10 * inputValue) - 50;
            // * and - is Operator.
            // 10, inputValue and 50 is operands.
            // (10 * inputValue) - 50 is totally called expression.

// Arithmetic Operators:
        // +  ===> addition
        // -  ===> subtraction
        // *  ===> multiplication
        // /  ===> division
        // %  ===> modulus
        // ++ ===> increment
        // -- ===> decrement
        // &  ===> and gate (bit wise)
        // |  ===> or gate  (bit wise)
        // ^  ===> xor gate (bit wise)

// Assignment Operators: (When = is applied) with itself
        // ( = , += , -= , *= , /= , %= , (&= , |= , ^=))

// Comparison Operators: ( == , != , > , < , >= , <=)

// Logical Operators: ( && , || , ! , ^ )

        int b=15, c=10;

        System.out.println(b&c);
        System.out.println(b|c);
        System.out.println(b^c);


        boolean a=true, d=true;
// xor:
        if(a ^ d) {
            System.out.println("true");
        }
        else {
            System.out.println("False");
        }

// ( ! ) Not:
    // first example:
        if(!a || !d) {
            System.out.println("true");
        }
        else {
            System.out.println("False");
        }

    // Second example:
        if(!isTrueOrFalse()){
            System.out.println("true");
        }
        else{
            System.out.println("False");
        }

    }

     static boolean isTrueOrFalse(){
        return true;
    }

}
