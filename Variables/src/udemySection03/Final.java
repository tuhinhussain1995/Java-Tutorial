package udemySection03;

public class Final {
    public static void display(){

        // final refers to the constant value.
        // We can't overwrite the value again.

        final boolean myBoolean = true;
        final byte myByte = 34;
        final char myChar ='A';
        final String myString = "Tuhin";
        final short myShort = 343;
        final int myInt = 34;

        final long myLong = 1_245_554_555_444_464L;
        final float myFloat = 3.1_416f;
        final double myDouble = 3.124_512_469_852d;

        System.out.println(myBoolean);
        System.out.println(myByte);
        System.out.println(myChar);
        System.out.println(myString);
        System.out.println(myShort);
        System.out.println(myInt);
        System.out.println(myLong);
        System.out.println(myFloat);
        System.out.println(myDouble);

    }
}
