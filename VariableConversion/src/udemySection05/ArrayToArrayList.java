package udemySection05;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayToArrayList {
    public static void display(){

        String[] stringArray = { "a", "b", "c", "d", "e" };
        String stringArray2[] = {"Tuhin", "Nazrul"};

    // First:
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.addAll(Arrays.asList(stringArray));
        arrayList1.addAll(Arrays.asList(stringArray2));
        System.out.println(arrayList1);

    // Second:
        ArrayList<String> arrayList2 = new ArrayList<>(Arrays.asList(stringArray));
        arrayList2.addAll(Arrays.asList(stringArray2));
        System.out.println(arrayList2);
    }
}
