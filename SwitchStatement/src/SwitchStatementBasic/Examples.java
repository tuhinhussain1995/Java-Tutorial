package SwitchStatementBasic;

import java.util.Scanner;

public class Examples {

    public static void example1(){
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
            case 5:
                day = "Thursday";
                break;
            case 6:
                day = "Friday";
                break;
            case 7:
                day = "Saturday";
                break;
            default:
                day = "Invalid day";
                break;
        }
        System.out.println("The day is " + day);
    }



    public static void example2(){
        char operator;
        Double number1, number2, result;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter operator (either +, -, * or /): ");
        operator = scanner.next().charAt(0);

        System.out.print("Enter number1 and number2 respectively by using blank space: ");
        number1 = scanner.nextDouble();
        number2 = scanner.nextDouble();


        switch (operator) {
            case '+':
                result = number1 + number2;
                System.out.print(number1 + "+" + number2 + " = " + result);
                break;

            case '-':
                result = number1 - number2;
                System.out.print(number1 + "-" + number2 + " = " + result);
                break;

            case '*':
                result = number1 * number2;
                System.out.print(number1 + "*" + number2 + " = " + result);
                break;

            case '/':
                result = number1 / number2;
                System.out.print(number1 + "/" + number2 + " = " + result);
                break;

            default:
                System.out.println("Invalid operator!");
                break;
        }
    }
}
