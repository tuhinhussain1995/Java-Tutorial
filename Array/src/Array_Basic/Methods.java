package Array_Basic;

import java.util.*;

public class Methods {
    public static void display(){

// Check if an Array contains a certain value:
        String[] stringArray1 = { "a", "b", "c", "d", "e" };
        boolean b = Arrays.asList(stringArray1).contains("a");
        System.out.println(b);

        System.out.println(Arrays.asList(stringArray1).contains("n"));




// Concatenate two array:
        int[] firstArray = {23,45,12,78,4,90,1};
        int[] secondArray = {77,11,45,88,32,56,3};
        int fal = firstArray.length;
        int sal = secondArray.length;
        int[] result = new int[fal + sal];

        System.arraycopy(firstArray, 0, result, 0, fal);
        System.arraycopy(secondArray, 0, result, fal, sal);

        System.out.println(Arrays.toString(result));



// Declare an array inline:
        System.out.println(Arrays.toString(new String[]{"a", "b", "c", "d"}));


// Joins the elements of the provided array into a single String:
        String[] myString = {"A", "E", "I", "O", "U"};
        String newString = String.join("==>", myString);

        System.out.println(newString);

    }
}
