package ArrayBasic;

public class MultidimentionalArray {

////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////// 2 Dimensional Array /////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////

    public static void example1(){
        int[][] a = {{1, 2, 3}, {4, 5, 6, 9}, {7}};

        System.out.println("Length of row 1: " + a[0].length);
        System.out.println("Length of row 2: " + a[1].length);
        System.out.println("Length of row 3: " + a[2].length);
    }


    public static void example2(){
        int[][] a = {{1, -2, 3}, {-4, -5, 6, 9}, {7}};

        for (int i = 0; i < a.length; ++i) {            // row
            for(int j = 0; j < a[i].length; ++j) {      // column
                System.out.println(a[i][j]);
            }
        }
    }


    public static void example3(){
        int[][] a = {{1, -2, 3}, {-4, -5, 6, 9}, {7}};

        for (int[] innerArray: a) {                  // row
            for(int data: innerArray) {              // column
                System.out.println(data);
            }
        }
    }


////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////// 3 Dimensional Array /////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////

    public static void example4(){
        int[][][] test = {{{1, -2, 3}, {2, 3, 4}},  {{-4, -5, 6, 9}, {1}, {2, 3}}};

        for (int[][] array2D: test) {                // row
            for (int[] array1D: array2D) {           // 1st column
                for(int item: array1D) {             // 2nd column
                    System.out.println(item);
                }
            }
        }
    }


}
