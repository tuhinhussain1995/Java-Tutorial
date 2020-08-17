package WhileDoWhileLoopBasic;

public class WhileLoop {
    public static void example1(){
        int i = 1;

        while (i <= 10) {
            System.out.println("Line " + i);
            ++i;
        }
    }


    public static void example2(){
        int sum = 0, i = 100;

        while (i != 0) {
            sum += i;     // sum = sum + i;
            --i;
        }

        System.out.println("Sum = " + sum);
    }
}
