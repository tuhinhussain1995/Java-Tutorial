package ForLoopBasic;

import java.util.ArrayList;
import java.util.Arrays;

public class Examples {
    public static void example1(){
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};

        for (char item: vowels) {
            System.out.println(item);
        }
    }


    public static void example2(){
        int[] numbers = {3, 4, 5, -5, 0, 12};
        int sum = 0;

        for (int number: numbers) {
            sum += number;
        }

        System.out.println("Sum = " + sum);
    }


    public static void example3(){
        ArrayList myList = new ArrayList(Arrays.asList(34, "Tuhin", 45.34f, false, 676.343d, 't'));

        for (java.lang.Object myObj : myList) {
            System.out.println(myObj);
        }
    }
}
