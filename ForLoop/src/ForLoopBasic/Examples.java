package ForLoopBasic;

public class Examples {
    public static void example1(){
        for (int i = 1; i <= 10; ++i) {
            System.out.println("Line " + i);
        }
    }


    public static void example2(){
        int sum = 0;

        for (int i = 1; i <= 1000; ++i) {
            sum += i;     // sum = sum + i
        }

        System.out.println("Sum = " + sum);
    }


    public static void example3(){
        int sum = 0;

        for (int i = 10; i >= 1; --i) {
            System.out.println("Hello");
        }
    }
}
