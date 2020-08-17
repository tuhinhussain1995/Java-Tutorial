package WhileLoop;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner tuhin = new Scanner(System.in);

        char decision = 'y';

        while (decision == 'y'){
            System.out.println("Running...");

            System.out.print("Enter your decision: ");
            decision = tuhin.next().charAt(0);
        }
        System.out.println("Finish char");

        tuhin.nextLine();

        String decision1 = "yes";

        while (decision1.equals("yes")){        // for String input must use equal function instead of using ==
            System.out.println("Continuing...");

            System.out.print("Enter your decision: ");
            decision1 = tuhin.next();
        }

        System.out.println("Finish String");

        int answer = 1;

        while(answer != 10){

            System.out.print("7+3 = ");

            answer = tuhin.nextInt();
        }

        System.out.println("Finish Int");

        tuhin.close();
    }
}
