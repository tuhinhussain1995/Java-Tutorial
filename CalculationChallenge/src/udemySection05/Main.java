package udemySection05;

public class Main {

    public static void main(String[] args) {
// PrimeNumber:
        PrimeNumber.display(100);

// Palindrome Number:
        System.out.println(PalindromeChecker.isPalindrome(545));

// First and Last Digit Sum:
        FastLastDigitSum a = new FastLastDigitSum();
        System.out.println(a.sumFirstAndLastDigit(625987418));

// Shared Digit:
        System.out.println(SharedDigit.hasSharedDigit(9, 99));
    }
}
