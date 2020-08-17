package MethodsBasic;

public class MethodsExample1 {

    public static void example1(){
        System.out.println("About to encounter a method.");

        myMethod();

        System.out.println("Method was executed successfully!");
    }


    public static void example2(){
        Output obj = new Output();
        System.out.println("About to encounter a method.");

        obj.myMethod();

        System.out.println("Method was executed successfully!");
    }


    public static void example3(){
        int result;

        result = square();
        System.out.println("Squared value of 10 is: " + result);
    }


    public static void example4(){
        int result, n;

        n = 3;
        result = square(n);
        System.out.println("Square of 3 is: " + result);

        n = 4;
        result = square(n);
        System.out.println("Square of 4 is: " + result);
    }


    public static void example5(){
        System.out.println("10 + 20 = " + getIntegerSum(10, 20));
        System.out.println("20 x 40 = " + multiplyInteger(20, 40));
    }


    public static void example6(){
        for (int i = 1; i <= 5; i++) {

            int result = getSquare(i);
            System.out.println("Square of " + i + " is: " + result);
        }
    }

////////////////////////////////////////////////////////////////////////////////

    private static void myMethod(){
        System.out.println("Printing from inside myMethod()!");
    }


    public static int square() {
        return 10 * 10;
    }


    static int square(int i) {
        return i * i;
    }


    public static int getIntegerSum (int i, int j) {
        return i + j;
    }


    public static int multiplyInteger (int x, int y) {
        return x * y;
    }


    private static int getSquare(int x){
        return x * x;
    }

}

//////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////

class Output {
    public void myMethod() {
        System.out.println("Printing from inside myMethod().");
    }
}