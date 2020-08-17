package OperatorsBasic;

public class UnaryOperators {
    public static void display(){

// Unary Operator:
        // +, -, ++, --, !


        int a = 20, b = 10, c = 0, d = 20, e = 40, f = 30;
        boolean condition = true;

// +
        System.out.println(+a);
        System.out.println(+e);


// -
        System.out.println(-a);
        System.out.println(-e);


// ++
        // pre-increment operator
        // a = a+1 and then c = a;
        c = ++a;
        System.out.println("Value of c (++a) = " + c);

        // post increment operator
        // c=b then b=b+1
        c = b++;
        System.out.println("Value of c (b++) = " + c);


// --
        // pre-decrement operator
        // d=d-1 then c=d
        c = --d;
        System.out.println("Value of c (--d) = " + c);

        // post-decrement operator
        // c=e then e=e-1
        c = e--;
        System.out.println("Value of c (e--) = " + c);


// !
        // Logical not operator
        System.out.println("Value of !condition =" + !condition);

    }
}
