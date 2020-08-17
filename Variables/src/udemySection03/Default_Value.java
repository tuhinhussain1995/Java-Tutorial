package udemySection03;

// byte default value = 0.
// short default value = 0.
// int default value = 0.
// long default value = 0L.
// float default value = 0.0f.
// double default value = 0.0d.
// char default value = '\u0000'.
// boolean default value = false.
// String default value = null.

import java.util.Arrays;

public class Default_Value {
    public static void display(){
        boolean myBoolean = false;
        byte myByte = 0;
        char myChar ='\u0000';      // null char
        String myString = null;
        short myShort = 0;
        int myInt = 0;

        long myLong = 0L;
        float myFloat = 0.0f;
        double myDouble = 0.0d;

        System.out.println(myBoolean);
        System.out.println(myByte);
        System.out.println(myChar);
        System.out.println(myString);
        System.out.println(myShort);
        System.out.println(myInt);
        System.out.println(myLong);
        System.out.println(myFloat);
        System.out.println(myDouble);


// Array:

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




        boolean[] myArrayBoolean = {false, true, false, false, false};
        byte[] myArrayByte = {2, 0, 0, 0, 4, 0};
        char[] myArrayChar = {'\u0000', '\u0032', '\u0000', '\u0000', '\u0000'};
        String[] myArrayString = {"tuhin", null, "nazrul", null, null, "jesan", null};
        short[] myArrayShort = {0, 0, 3, 0, 0};
        int[] myArrayInt = {1, 0, 0, 4, 0, 0};

        long[] myArrayLong = {2L, 0L, 0L, 0L, 0L, 9L};
        float[] myArrayFloat = {3.1416f, 0.0f, 0.0f, 0.0f, 0.0f};
        double[] myArrayDouble = {0.0d, 3.1416d, 0.0d, 0.0d, 0.0d};

    }
}
