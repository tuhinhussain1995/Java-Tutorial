package udemySection05;

public class FastLastDigitSum {
    protected int sumFirstAndLastDigit(int number){
        int n = number;
        int temp = number;
        int sum = 0, remainder;
        int increment = 1;

        while(n != 0){
            remainder = n % 10;
            n /= 10;

            if(increment == 1 || n == 0){
                sum = sum + remainder;
            }

            increment++;
        }

        return sum;
    }
}
