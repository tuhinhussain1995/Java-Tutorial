package udemySection05;

public class PalindromeChecker {
    protected static boolean isPalindrome(int number){
        int n = number;
        int remainder, sum = 0;

        while(n != 0){
            remainder = n % 10;
            sum = (sum * 10) + remainder;
            n /= 10;
        }

        if (sum == number){
            return true;
        }

        return false;
    }
}
