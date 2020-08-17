package udemySection05;

public class PrimeNumber {
    public static void display(int input){
        calcPrimeNumber(input);
    }

    private static void calcPrimeNumber( int limit){
        System.out.println("Prime Numbers Are:");
        for(int i=2; i <= limit; i++) {
            for(int j=2; j <= i; j++) {
                if(i%j == 0) {
                    if(i==j) {
                        System.out.print((i==2 ? "" : ", ") + i);
                    }
                    else {
                        break;
                    }
                }
            }
        }
        System.out.println("\n");
    }
}
