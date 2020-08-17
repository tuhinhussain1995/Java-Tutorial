package ArrayBasic;

public class SimpleArray {

    public static void example1(){
        int[] age = new int[5];

        for (int i = 0; i < 5; ++i) {
            System.out.println(age[i]);
        }
    }


    public static void example2(){
        int[] age = {12, 4, 5, 2, 5};

        for (int i = 0; i < 5; ++i) {
            System.out.println("Element at index " + i +": " + age[i]);
        }
    }


    public static void example3(){
        int[] age = new int[5];

        age[2] = 14;
        age[0] = 34;

        for (int i = 0; i < 5; ++i) {
            System.out.println("Element at index " + i +": " + age[i]);
        }
    }


    public static void example4(){
        int[] numbers = new int[]{2, -9, 0, 5, 12, -25, 22, 9, 8, 12};
        int sum = 0;
        Double average;

        for (int number: numbers) {
            sum += number;
        }

        int arrayLength = numbers.length;

        average =  ((double)sum / (double)arrayLength);

        System.out.println("Sum = " + sum);
        System.out.println("Average = " + average);
    }
}
