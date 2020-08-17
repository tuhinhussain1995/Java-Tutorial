package ArrayBasic;

import java.util.Arrays;

public class CopyArrays {

////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////// Copying Arrays Using Assignment Operator ////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    // Both array share the same memory address.
    // If we change elements of one array, corresponding elements of the other arrays also change.

    public static void copyingArrayUsingAssignmentOperator(){
        int [] numbers = {1, 2, 3, 4, 5, 6};
        int [] positiveNumbers = numbers;    // positiveNumber array pointing to the numbers array's memory address.

        for (int number: positiveNumbers) {
            System.out.print(number + ", ");
        }
    }


    public static void bothArrayShareSameMemoryAddress(){
        int [] numbers = {1, 2, 3, 4, 5, 6};
        int [] positiveNumbers = numbers;    // positiveNumber array pointing to the numbers array's memory address.

        numbers[0] = -1;         // Both arrays value will be changed.

        for (int number: positiveNumbers) {
            System.out.print(number + ", ");
        }
    }


////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////// Using Looping Construct to Copy Arrays //////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public static void usingLooping(){
        int [] source = {1, 2, 3, 4, 5, 6};
        int [] destination = new int[6];

        for (int i = 0; i < source.length; ++i) {
            destination[i] = source[i];
        }

        System.out.println(Arrays.toString(destination));
    }


    public static void copying2dArraysUsingLoop(){
        int[][] source = {{1, 2, 3, 4}, {5, 6}, {0, 2, 42, -4, 5}};

        int[][] destination = new int[source.length][];

        for (int i = 0; i < destination.length; ++i) {

            destination[i] = new int[source[i].length];        // allocating space for each row of destination array

            for (int j = 0; j < destination[i].length; ++j) {
                destination[i][j] = source[i][j];
            }
        }

        System.out.println(Arrays.deepToString(destination));
    }


////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////// Copying Arrays Using arraycopy() method //////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////


// System.arraycopy(copyFromArrayName, int startCopyFromIndexNo, copyToArrayName, int startCopyToIndexNo, int totalElement)


    public static void copyingArraysUsingArrayCopyMethod(){
        int[] n1 = {2, 3, 12, 4, 12, -2};
        int[] n2 = new int[n1.length];
        int[] n3 = new int[5];

        System.arraycopy(n1, 0, n2, 0, n1.length);
        System.out.println("n2 = " + Arrays.toString(n2));

        // copying elements from index 2 on n1 array
        // copying element to index 1 of n3 array
        // 2 elements will be copied
        System.arraycopy(n1, 2, n3, 1, 2);
        System.out.println("n3 = " + Arrays.toString(n3));
    }


    public static void copying2dArraysUsingArrayCopy(){
        int[][] source = {{1, 2, 3, 4}, {5, 6}, {0, 2, 42, -4, 5}};

        int[][] destination = new int[source.length][];

        for (int i = 0; i < source.length; ++i) {

            destination[i] = new int[source[i].length];      // allocating space for each row of destination array

            System.arraycopy(source[i], 0, destination[i], 0, destination[i].length);
        }

        // displaying destination array
        System.out.println(Arrays.deepToString(destination));
    }


////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////// Copying Arrays Using copyOfRange() method //////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////


// Arrays.copyOfRange(copyFromArrayName, startCopyFromIndexNo, endCopyFromIndexNo)


    public static void copyingArraysUsingCopyOfRangeMethod(){
        int[] source = {2, 3, 12, 4, 12, -2};

        int[] destination1 = Arrays.copyOfRange(source, 0, source.length);
        System.out.println("destination1 = " + Arrays.toString(destination1));

        // copying from index 2 to 5 (5 is not included)
        int[] destination2 = Arrays.copyOfRange(source, 2, 5);
        System.out.println("destination2 = " + Arrays.toString(destination2));
    }

}
