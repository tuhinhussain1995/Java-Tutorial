package Array_Methods;

import java.util.Arrays;

public class toString {
    public static void display(){
        int[] intArray = { 1, 2, 3, 4, 5 };
        System.out.println(intArray);

        // First:
        boolean[] boolArr = new boolean[] { true, true, false, true };
        byte[] byteArr = new byte[] { 10, 20, 30 };
        char[] charArr = new char[] { 'g', 'e', 'e', 'k', 's' };
        double[] dblArr = new double[] { 1, 2, 3, 4 };
        float[] floatArr = new float[] { 1, 2, 3, 4 };
        int[] intArr = new int[] { 1, 2, 3, 4 };
        long[] lomgArr = new long[] { 1, 2, 3, 4 };
        Object[] objArr = new Object[] { 1, 2, 3, 4 };
        short[] shortArr = new short[] { 1, 2, 3, 4 };
        String[] stringArr = {"A", "E", "I", "O", "U"};

        System.out.println(Arrays.toString(boolArr));
        System.out.println(Arrays.toString(byteArr));
        System.out.println(Arrays.toString(charArr));
        System.out.println(Arrays.toString(dblArr));
        System.out.println(Arrays.toString(floatArr));
        System.out.println(Arrays.toString(intArr));
        System.out.println(Arrays.toString(lomgArr));
        System.out.println(Arrays.toString(objArr));
        System.out.println(Arrays.toString(shortArr));
        System.out.println(Arrays.toString(stringArr));


        // Second:
        String str1 = Arrays.toString(boolArr);
        String str2 = Arrays.toString(byteArr);
        String str3 = Arrays.toString(charArr);
        String str4 = Arrays.toString(dblArr);
        String str5 = Arrays.toString(floatArr);
        String str6 = Arrays.toString(intArr);
        String str7 = Arrays.toString(lomgArr);
        String str8 = Arrays.toString(objArr);
        String str9 = Arrays.toString(shortArr);
        String str10 = Arrays.toString(stringArr);

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);
        System.out.println(str5);
        System.out.println(str6);
        System.out.println(str7);
        System.out.println(str8);
        System.out.println(str9);
        System.out.println(str10);

        for(int x=0; x<str10.length(); x++){
            System.out.println(str10.charAt(x));
        }
    }
}
