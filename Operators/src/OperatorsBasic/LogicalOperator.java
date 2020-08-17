package OperatorsBasic;

import java.util.Scanner;

public class LogicalOperator {
    public static void display(){

// Logical Operator:
        // ||, &&


        String x = "Sher";
        String y = "Locked";

        Scanner s = new Scanner(System.in);

        System.out.print("Enter username:");
        String uuid = s.next();
        System.out.print("Enter password:");
        String upwd = s.next();


        if ((uuid.equals(x) && upwd.equals(y)) || (uuid.equals(y) && upwd.equals(x))) {
            System.out.println("Welcome user.");
        }
        else {
            System.out.println("Wrong uid or password");
        }
    }
}
