package udemySection05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListToArray {
    public static void display(){
        String str1[] = { "A", "E", "I" };
        String str2[] = { "O", "U" };

        List<String> list = new ArrayList<String>();
        list.addAll(Arrays.asList(str1));
        list.addAll(Arrays.asList(str2));

        System.out.println(list);

        Object[] str3 = list.toArray();
        System.out.println(Arrays.toString(str3));
    }
}
