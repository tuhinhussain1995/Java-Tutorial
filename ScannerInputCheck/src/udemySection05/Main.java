package udemySection05;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        booleanScannerCheck();
    }

    public static void booleanScannerCheck(){
        Scanner myScanner = new Scanner(System.in);

        System.out.print("Enter a integer number: ");
        boolean hasNextInt = myScanner.hasNextInt();

        if (hasNextInt){
            int myInt = myScanner.nextInt();
            System.out.println("Integer number is: " + myInt);
        }
        else{
            System.out.println("Wrong Input");
        }

        myScanner.nextLine();  // handel next line character (Enter key)

        System.out.print("Enter a Double Number: ");
        boolean hasNextDouble = myScanner.hasNextDouble();

        if (hasNextDouble){
            Double myDouble = myScanner.nextDouble();
            System.out.println("Integer number is: " + myDouble);
        }
        else{
            System.out.println("Wrong Input");
        }

        myScanner.close();
    }
}
