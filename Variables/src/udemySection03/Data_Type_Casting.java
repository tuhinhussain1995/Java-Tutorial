package udemySection03;

public class Data_Type_Casting {
    public static void display(){
        // Data Type Casting:

        // Widening:
        byte myByte = Byte.MAX_VALUE;
        short myShort = myByte;
        int myInt = myShort;
        long myLong = myInt;
        float myFloat = myLong;
        double myDouble = myFloat;

        System.out.println("Type Casting: Widening: ");
        System.out.println(myByte + "->" + myShort + "->" + myInt + "->" + myLong + "->" + myFloat + "->" + myDouble);
        // Narrowing:
        myDouble = Byte.MAX_VALUE;
        myFloat = (float) myDouble;
        myLong = (long) myFloat;
        myInt = (int) myLong;
        myShort = (short) myInt;
        myByte = (byte) myShort;

        System.out.println("Type Casting: Narrowing: ");
        System.out.println(myDouble + "->" + myFloat + "->" + myLong + "->" + myInt + "->" + myShort + "->" + myByte);
    }
}
