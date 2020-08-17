package Array_Basic;

public class Neasted_Array {
    public static void display(){
        double[][] myDouble = {{2.33f, 5.323f, 1.3f}, {3.23f, 343.34f}, {3.3f}};   // That is the total allocated memory address
        // or double[][] myDouble = new double[][]{{2.33f, 5.323f, 1.3f}, {3.23f, 343.34f}, {3.3f}};

        System.out.println(myDouble[1][1]);

        myDouble[0][1] = 33.44f;
        // myDouble[2][3] = 33.222f;

        System.out.println(myDouble[0][2]);
        System.out.println(myDouble[2][0]);





        String[][] stringArray = new String[3][2];

        for (int i=0; i<3; i++){
            for (int j=0; j<2; j++){
                System.out.print(stringArray[i][j] + " => ");
            }
            System.out.println();
        }
    }
}
