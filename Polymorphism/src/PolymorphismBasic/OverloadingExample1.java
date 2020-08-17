package PolymorphismBasic;

public class OverloadingExample1 {

    public void displayPattern(){
        for(int i = 0; i < 10; i++) {
            System.out.print("*");
        }
    }

    public void displayPattern(char symbol) {
        for(int i = 0; i < 10; i++) {
            System.out.print(symbol);
        }
    }


    public static void display(){
        OverloadingExample1 d1 = new OverloadingExample1();

        d1.displayPattern();
        System.out.println();

        d1.displayPattern('#');
        System.out.println();
    }
}
