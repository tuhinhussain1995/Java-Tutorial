package Array_Methods;

import java.util.Arrays;

public class copyOf {
    public static void display(){
        String[] myString = new String[] {"tuhin", "nazrul", "sumon"};

    // First:
        String[] copyString1 = Arrays.copyOf(myString, myString.length);
        System.out.println(Arrays.toString(copyString1));

    // Second:
        String[] copyString2 = Arrays.copyOf(myString, 20);
        System.out.println(Arrays.toString(copyString2));

        copyString2[6] = "mhafuz";
        copyString2[17] = "halim";

        System.out.println(Arrays.toString(copyString2));
    }
}
