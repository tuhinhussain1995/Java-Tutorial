package udemySection05;

public class SharedDigit {
    public static  boolean hasSharedDigit(int num1, int num2){
        if(num1 >= 10 && num1 <= 99 && num2 >= 10 && num2 <= 99){
            int num11, num12, num21, num22;

            num12 = num1 % 10;
            num1 /= 10;
            num11 = num1 % 10;

            num22 = num2 % 10;
            num1 /= 10;
            num21 = num2 % 10;

            if (num11 == num21 || num11 == num22 || num12 == num21 || num12 == num22){
                return true;
            }
        }
        return false;
    }
}
