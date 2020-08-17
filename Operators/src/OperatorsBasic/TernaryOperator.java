package OperatorsBasic;

public class TernaryOperator {
    public static void display(){

        int februaryDays = 29;
        String res;

        res =  (februaryDays == 28) ? "Not a leap year" : "Leap year";
        System.out.println(res);

        System.out.println((februaryDays == 28) ? "Not a leap year" : "Leap year");





        int a = 20, b = 10, c = 30, result;

        // result holds max of three

        result = ((a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c));

        System.out.println("Max of three numbers = " + result);
    }
}
