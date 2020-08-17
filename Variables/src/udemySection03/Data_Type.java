package udemySection03;

public class Data_Type {
    public static void display(){
        boolean myBoolean = true;
        byte myByte = 34;
        char myChar ='A';
        String myString = "Tuhin";
        short myShort = 343;
        int myInt = 34;

        long myLong = 1_245_554_555_444_464L;
        float myFloat = 3.1_416f;
        double myDouble = 3.124_512_469_852d;

        System.out.println(((Object)myBoolean).getClass().getName());
        System.out.println(((Object)myByte).getClass().getName());
        System.out.println(((Object)myChar).getClass().getName());
        System.out.println(((Object)myString).getClass().getName());
        System.out.println(((Object)myShort).getClass().getName());
        System.out.println(((Object)myInt).getClass().getName());

        System.out.println(((Object)myLong).getClass().getName());
        System.out.println(((Object)myFloat).getClass().getName());
        System.out.println(((Object)myDouble).getClass().getName());


        // verifying data type:

        if (((Object)myDouble).getClass().getName() == "java.lang.Double"){
            System.out.println("Yes, it is a Double");
        }

    }
}
