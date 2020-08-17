package Array_Basic;

import java.util.Arrays;

public class Basic2 {
    public static void display(){

// First:
        float[] myFloatValue;
        myFloatValue = new float[]{3.4f, 5.3f, 11.44f};

        System.out.println("myFloatValue: " + Arrays.toString(myFloatValue));

        float[] anotherFloat;
        anotherFloat = myFloatValue;

        System.out.println("AnotherFloat: " + Arrays.toString(anotherFloat));


// Second:
        float[] myFloatValue2 = new float[]{3.4f, 5.3f, 11.44f};
        System.out.println("myFloatValue: " + Arrays.toString(myFloatValue2));

        float[] anotherFloat2 = {555.0f, 44.3f, 4711.9f, 5555.65f};
        System.out.println("AnotherFloat: " + Arrays.toString(anotherFloat2));

        anotherFloat2 = myFloatValue2;
        System.out.println("AnotherFloat: " + Arrays.toString(anotherFloat2));


        anotherFloat2 = Arrays.copyOf(myFloatValue2, 15);                      // new length
        System.out.println("AnotherFloat: " + Arrays.toString(anotherFloat2));
        
    }
}
