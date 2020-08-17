package IfElseStatementBasic;

public class Examples {
    public static void example1(){
        int number = 10;

        if (number > 0) {
            System.out.println("The number is positive.");
        }

        System.out.println("This statement is always executed.");
    }


    public static void example2(){
        int number = 10;

        if (number > 0) {
            System.out.println("The number is positive.");
        }
        else {
            System.out.println("The number is not positive.");
        }

        System.out.println("This statement is always executed.");
    }


    public static void example3(){
        int number = 0;

        if (number > 0) {
            System.out.println("The number is positive.");
        }
        else if (number < 0) {
            System.out.println("The number is negative.");
        }
        else {
            System.out.println("The number is 0.");
        }
    }


    public static void neastedIfElse(){
        Double n1 = -1.0, n2 = 4.5, n3 = -5.3, largestNumber;

        if (n1 >= n2) {
            if (n1 >= n3) {
                largestNumber = n1;
            }
            else {
                largestNumber = n3;
            }
        }
        else {
            if (n2 >= n3) {
                largestNumber = n2;
            }

            else {
                largestNumber = n3;
            }
        }

        System.out.println("The largest number is " + largestNumber);
    }
}
