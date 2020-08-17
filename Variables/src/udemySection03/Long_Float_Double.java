package udemySection03;

public class Long_Float_Double {
    public static void display(){
        // with long, float and double must use L, f and d respectively.

        long myLong1 = 1_245_554_555_444_464L;
        long myLong2 = 50_000L + (10L * myLong1);

        float myFloat1 = 3.1_416f;
        float myFloat2 = 5_000f / myFloat1;

        double myDouble1 = 3.124_512_469_852d;
        double myDouble2 = 2_353d * (200d / myDouble1);


        System.out.println("myLong1 value: "+ myLong1);
        System.out.println("myLong2 value: "+ myLong2);

        System.out.println("myFloat1 value: "+ myFloat1);
        System.out.println("myFloat2 value: "+ myFloat2);

        System.out.println("myDouble1 value: "+ myDouble1);
        System.out.println("myDouble2 value: "+ myDouble2);
    }
}
