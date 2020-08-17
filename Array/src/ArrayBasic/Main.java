package ArrayBasic;

public class Main {

    public static void main(String[] args) {
        SimpleArray.example1();
        SimpleArray.example2();
        SimpleArray.example3();
        SimpleArray.example4();

        MultidimentionalArray.example1();
        MultidimentionalArray.example2();
        MultidimentionalArray.example3();
        MultidimentionalArray.example4();

        CopyArrays.copyingArrayUsingAssignmentOperator();
        CopyArrays.bothArrayShareSameMemoryAddress();
        CopyArrays.usingLooping();
        CopyArrays.copying2dArraysUsingLoop();
        CopyArrays.copyingArraysUsingArrayCopyMethod();
        CopyArrays.copying2dArraysUsingArrayCopy();
        CopyArrays.copyingArraysUsingCopyOfRangeMethod();

        DefaultArrayValues.display();



// Simple Array:

        // An array is a collection of similar types of data. It is a container that holds data (values) of one single type.

        // double[] myArray = new Double[10];
        // Once the length of the array is defined, it cannot be changed in the program.

                // int[] age = new int[5];
                // int[] age = {12, 4, 5, 2, 5};
                // int[] age = new int[]{12, 4, 5, 2, 5};



// Multidimensional Array:

        // each element of the multidimensional array is an array itself.
        // a 3d array is an array of 2d arrays.

        // 2 Dimension: (row, column)

                // int[][] age = new int[3][4];
                // int[][] age = {{1, 2, 3}, {4, 5, 6, 9}, {7}};
                // int[][] age = new int[][]{{1, 2, 3}, {4, 5, 6, 9}, {7}};


        // 3 Dimension: (row, 1st column, 2nd column)

                // int[][][] data = new int[3][4][2];
                // int[][][] data = {{{1, -2, 3}, {2, 3, 4}},  {{-4, -5, 6, 9}, {1}, {2, 3}}};
                // int[][][] data = new int[][][]{{{1, -2, 3}, {2, 3, 4}},  {{-4, -5, 6, 9}, {1}, {2, 3}}};


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


    }
}
