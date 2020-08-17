package udemySection05;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListToString {
    public static void display(){
        ArrayList<String> myArrayList = new ArrayList<>(Arrays.asList("A", "B", "C"));

        String myString = myArrayList.toString();
        System.out.println(myString);
    }
}
