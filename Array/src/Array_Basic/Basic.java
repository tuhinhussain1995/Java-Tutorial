package Array_Basic;

import java.util.Arrays;

public class Basic {
    public static void display(){
        int[] myIntArray1 = {66,88,99,333,666};              // process: 1

        int[] myIntArray2 = new int[10];                     // process: 2

        int[] myIntArray3 = new int[]{555,44,4711,5555};     // process: 3

        System.out.println(Arrays.toString(myIntArray1));
        System.out.println(Arrays.toString(myIntArray2));
        System.out.println(Arrays.toString(myIntArray3));





        boolean[] myBooleanArray = new boolean[10];
        byte[] myByteArray = new byte[10];
        char[] myCharArray = new char[10];
        String[] myStringArray = new String[10];
        short[] myShortArray = new short[10];
        int[] myIntArray = new int[10];

        long[] myLongArray = new long[10];
        float[] myFloatArray = new float[10];
        double[] myDoubleArray = new double[10];

        System.out.println(Arrays.toString(myBooleanArray));
        System.out.println(Arrays.toString(myByteArray));
        System.out.println(Arrays.toString(myCharArray));
        System.out.println(Arrays.toString(myStringArray));
        System.out.println(Arrays.toString(myShortArray));
        System.out.println(Arrays.toString(myIntArray));
        System.out.println(Arrays.toString(myLongArray));
        System.out.println(Arrays.toString(myFloatArray));
        System.out.println(Arrays.toString(myDoubleArray));
    }
}
