package BreakStatementBasic;

import java.util.Scanner;

public class UnlabeledBreakStatement {

    public static void breakWithSwitchStatement(){
        int week = 4;
        String day;

        switch (week) {
            case 1:
                day = "Sunday";
                break;
            case 2:
                day = "Monday";
                break;
            case 3:
                day = "Tuesday";
                break;
            case 4:
                day = "Wednesday";
                break;
            default:
                day = "Invalid day";
                break;
        }
        System.out.println("The day is " + day);
    }



    public static void breakWithForLoop(){
        for (int i = 1; i <= 10; ++i) {

            if (i == 5) {
                break;
            }
            System.out.println(i);
        }
    }


    public static void breakWithWhileLoop(){
        Double number, sum = 0.0;

        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a number: ");

            number = input.nextDouble();

            if (number == 0.0) {
                break;
            }

            sum += number;
        }
        System.out.println("Sum = " + sum);
    }


    public static void breakWithDoWhileLoop(){
        Double number, sum = 0.0;

        Scanner input = new Scanner(System.in);

        do {
            System.out.print("Enter a number: ");
            number = input.nextDouble();
            sum += number;

            if(number == 0.0){
                break;
            }
        } while (true);

        System.out.println("Sum = " + sum);

    }
}
