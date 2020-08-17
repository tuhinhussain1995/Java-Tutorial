package ArrayBasic;

import java.util.Arrays;

public class DefaultArrayValues {

    public static void display(){
        boolean[] myBooleanArray = new boolean[10];
        byte[] myByteArray = new byte[10];
        short[] myShortArray = new short[10];
        int[] myIntArray = new int[10];
        long[] myLongArray = new long[10];
        char[] myCharArray = new char[10];
        float[] myFloatArray = new float[10];
        double[] myDoubleArray = new double[10];
        String[] myStringArray = new String[10];


        System.out.println(Arrays.toString(myBooleanArray));
        System.out.println(Arrays.toString(myByteArray));
        System.out.println(Arrays.toString(myShortArray));
        System.out.println(Arrays.toString(myIntArray));
        System.out.println(Arrays.toString(myLongArray));
        System.out.println(Arrays.toString(myCharArray));
        System.out.println(Arrays.toString(myFloatArray));
        System.out.println(Arrays.toString(myDoubleArray));
        System.out.println(Arrays.toString(myStringArray));
    }

}



// Default Array values.
        // boolean ----------- false
        // byte -------------- 0
        // short ------------- 0
        // int --------------- 0
        // long -------------- 0L
        // char -------------- \u0000
        // float ------------- 0.0f
        // double ------------ 0.0d
        // String ------------ null