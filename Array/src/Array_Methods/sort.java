package Array_Methods;

import java.util.Arrays;
import java.util.Collections;

public class sort {
    public static void display(){

    // First:
        int[] myArray = {13, 7, 6, 45, 21, 9, 101, 102};

        Arrays.sort(myArray);
        System.out.println(Arrays.toString(myArray));

    // Second:
        int[] myArray2 = {13, 7, 6, 45, 21, 9, 101, 102};

        Arrays.sort(myArray2, 1, 5); // sort between 1 to 5
        System.out.println(Arrays.toString(myArray2));



    // Reverse Order:
        Integer[] myArray3 = {13, 7, 6, 45, 21, 9, 101, 102};

        Arrays.sort(myArray3, Collections.reverseOrder());
        System.out.println(Arrays.toString(myArray3));
    }
}
