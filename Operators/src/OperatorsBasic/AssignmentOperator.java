package OperatorsBasic;

public class AssignmentOperator {
    public static void display(){

// Assignment Operator:
        // =, +=, -=, *=, /=, %=, <<=, >>=, &=, ^=, |=


        int a = 20, b = 10, c, d, e = 10, f = 4, g = 9;


// =
        c = b;
        System.out.println("Value of c = " + c);


// +=, -=, *=, /=

        a += 1;        // a = a + 1;
        b -= 1;        // b = b - 1;
        e *= 2;        // e = e * 2;
        f /= 2;        // f = f / 2;
        System.out.println("a, b, e, f (" + "using shorthand operators)= " + a + ", " + b + ", " + e + ", " + f);
    }
}
