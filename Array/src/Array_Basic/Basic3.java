package Array_Basic;

import java.util.Arrays;

public class Basic3 {
    public static void display(){

// First:

        int[] intArray = new int[10];

        System.out.println(Arrays.toString(intArray));

        intArray[3] = 4;
        intArray[9] = 243;

        for (int i=0; i<10; i++){
            System.out.print(intArray[i] + " => ");
        }

        System.out.println();


// Second:

        String[] myString = {"tuhin", null, "nazrul", null, null, "jesan", null};
        // or String[] myString = new String[]{"tuhin", null, "nazrul", null, null, "jesan", null};

        for (int i=0; i < myString.length; i++){
            System.out.print(myString[i] + " => ");
        }
        System.out.println();

        myString[1] = "mhafuz";
        myString[3] = "sumon";

        for (int i=0; i < myString.length; i++){
            System.out.print(myString[i] + " => ");
        }
    }
}
