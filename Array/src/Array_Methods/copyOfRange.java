package Array_Methods;

import java.util.Arrays;

public class copyOfRange {
    public static void display(){
        int[] firstArray = {23,45,12,78,4,90,1};

    // First:
        int[] copyArray1 = Arrays.copyOfRange(firstArray, 2, 5);
        System.out.println(Arrays.toString(copyArray1));

    // Second:
        int[] copyArray2 = Arrays.copyOfRange(firstArray, 2, copyArray1.length + 6);
        System.out.println(Arrays.toString(copyArray2));
    }
}
