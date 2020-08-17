package ContinueStatementBasic;

import java.util.Scanner;

public class UnlabeledContinueStatement {

    public static void breakWithForLoop(){
        for (int i = 1; i <= 10; ++i) {

            if (i == 5) {
                continue;
            }
            System.out.println(i);
        }
    }


    public static void breakWithWhileLoop(){
        Double number, sum = 0.0;

        Scanner input = new Scanner(System.in);

        number = 0.0001;

        while (number != 0) {
            System.out.print("Enter a number: ");
            number = input.nextDouble();

            if (number == 100 || number==200) {
                continue;
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

            if (number == 100 || number==200) {
                continue;
            }
        } while (number != 0);

        System.out.println("Sum = " + sum);

    }
}
