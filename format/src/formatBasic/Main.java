package formatBasic;

// %n refers to the new line (or \n)
// %s refers to the String
// %S refers to the capital String
// %d refers to the int value
// %f refers to the float value
// %c refers to the character
// %C refers to the capital character
// %b refers to the boolean
// %B refers to the capital boolean

// + or nothing refers to right alignment
// - refers to the left alignment

public class Main {
    public static void main(String[] args){
        System.out.printf("%20s %15s %10d %n", "Tuhin", "BCS", 2016);
        System.out.printf("%-20s %-15s %-10d %n", "Tuhin", "BCS", 2016);
        System.out.printf("%20s %-15s %10d %n", "Tuhin", "BCS", 2016);

        System.out.printf("%d %n", 123);
        System.out.printf("%8d %n", 123);
        System.out.printf("%-8d %n", 123);
        System.out.printf("%08d %n", 123);


        System.out.printf("%f %n", 123.123456);
        System.out.printf("%6f %n", 123.123456);
        System.out.printf("%15f %n", 123.123456);
        System.out.printf("%-15f %n", 123.123456);
        System.out.printf("%15.2f %n", 123.123456);
        System.out.printf("%-15.2f %n", 123.123456);
        System.out.printf("%.2f %n", 123.123456);
        System.out.printf("%012f %n", 123.123456);

    }
}
