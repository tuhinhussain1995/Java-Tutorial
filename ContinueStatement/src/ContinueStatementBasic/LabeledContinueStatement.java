package ContinueStatementBasic;

public class LabeledContinueStatement {

    public static void example1(){

        first:
        for( int i = 1; i < 5; i++) {             // this for loop is labeled as first

            second:
            for(int j = 1; j < 3; j ++ ) {        // this for loop is labeled as second

                System.out.println("i = " + i + "; j = " +j);

                if ( i == 2)
                    continue first;
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
                    continue second;
            }
        }
    }


    public static void example3(){

        int process = 0;

        first:
        while (true) {             // this while loop is labeled as first
            second:
            while (true) {             // this while loop is labeled as second
                third:
                while(true) {             // this while loop is labeled as third
                    if(process==3){
                        System.out.println("Finished");
                        break first;
                    }

                    process++;
                    continue first;
                }
            }
        }
    }
}
