package OperatorsBasic;

public class BitwiseOperator {
    public static void display(){

// Bitwise and Bit Shift Operators
        // ~ (Complement)
        // << (Left Shift)
        // >> (Right Shift)
        // >>> (Unsigned Right Shift)
        // & (AND)
        // ^ (XOR)
        // | (inclusive OR)


// &, |, ^, ~

        int a = 0x0005;
        int b = 0x0007;

        System.out.println(a);
        System.out.println(b);

        // bitwise and
        // 0101 & 0111=0101
        System.out.println("a&b = " + (a & b));

        // bitwise and
        // 0101 | 0111=0111
        System.out.println("a|b = " + (a | b));

        // bitwise xor
        // 0101 ^ 0111=0010
        System.out.println("a^b = " + (a ^ b));

        // bitwise not
        // ~0101=1010
        System.out.println("~a = " + ~a);


        // can also be combined with
        // assignment operator to provide shorthand
        // assignment
        // a=a&b
        a &= b;
        System.out.println("a= " + a);



// >>, <<, >>>

        a = 0x0005;
        b = -10;

        // left shift operator
        // 0000 0101<<2 =0001 0100(20)
        // similar to 5*(2^2)
        System.out.println("a<<2 = " + (a << 2));

        // right shift operator
        // 0000 0101 >> 2 =0000 0001(1)
        // similar to 5/(2^2)
        System.out.println("a>>2 = " + (a >> 2));

        // unsigned right shift operator
        System.out.println("b>>>2 = " + (b >>> 2));
    }
}
