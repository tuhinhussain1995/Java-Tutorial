package udemySection05;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ArrayToSet {
    public static void display(){
        String[] stringArray = { "a", "b", "c", "d", "e" };

        Set<String> mySet = new HashSet<String>(Arrays.asList(stringArray));

        System.out.println(mySet);
    }
}
