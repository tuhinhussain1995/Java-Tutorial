package RecursionBasic;

public class FactorialExample {

    private static int factorial(int n) {
        if (n != 0)
            return n * factorial(n-1);
        else
            return 1;
    }


    public static void display(){
        int number = 4, result;
        result = factorial(number);
        System.out.println(number + " factorial = " + result);
    }
}


        // if input is 4 ========> 4*3*2*1*1
        // if input is 5 ========> 5*4*3*2*1*1
        // if input is 6 ========> 6*5*4*3*2*1*1
        // if input is 7 ========> 7*6*5*4*3*2*1*1