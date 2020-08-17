package BreakStatementBasic;

public class LabeledBreakStatement {
    public static void example1(){

        first:
        for( int i = 1; i < 5; i++) {             // this for loop is labeled as first

            second:
            for(int j = 1; j < 3; j ++ ) {        // this for loop is labeled as second

                System.out.println("i = " + i + "; j = " +j);

                if ( i == 2)
                    break first;
            }
        }
    }


    public static void example2(){

        first:
        for( int i = 1; i < 5; i++) {             // this for loop is labeled as first

            second:
            for(int j = 1; j < 3; j ++ ) {        // this for loop is labeled as second

                System.out.println("i = " + i + "; j = " +j);

                if ( i == 2)
                    break second;
            }
        }
    }


    public static void example3(){

        first:
        while (true) {             // this while loop is labeled as first
            second:
            while (true) {             // this while loop is labeled as second
                third:
                while(true) {             // this while loop is labeled as third
                    System.out.println("Finished");
                    break first;
                }
            }
        }
    }

}
