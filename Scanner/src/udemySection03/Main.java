package udemySection03;

import java.util.Scanner;  // java.util is package and Scanner is class

public class Main {

    public static void main(String[] args) {
        Scanner tuhin = new Scanner(System.in);

        String first, last, fullName;    // (each char 2 bytes)

        boolean is_correct;   // (true or false, 1 bit)
        char myChar;          // (character, 2 bytes)
        byte myByte;          // (number, 1 byte)  (-128 to 127) (2^8)
        short myShort;        // (number, 2 bytes) (-32,768 to 32,767) (2^16)
        int myInt;            // (number, 4 bytes) (-2,147,483,648 to 2,147,483,647)  (2^32)
        long myLong;          // (number, 8 bytes) ( -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807) (2^64)
        float myFloat;        // (decimal number, 4 bytes) (6 decimal place)
        double myDouble;      // (decimal number, 8 bytes) (15 decimal place)


        // if we use .next() and .nextLine() inside a single program
        // must call all .nextLine() first then .next()

        System.out.print("Enter your first name: ");
        first = tuhin.next();

        tuhin.nextLine(); // handle next line character (enter key)

        System.out.print("Enter your full name: ");
        fullName = tuhin.nextLine();
        System.out.print("Enter a int value: ");
        myInt = tuhin.nextInt();

        tuhin.nextLine(); // handle next line character (enter key)

        System.out.print("Enter your university name: ");
        last = tuhin.nextLine();
        System.out.print("Enter a double value: ");
        myDouble = tuhin.nextDouble();
        System.out.print("Enter a char value: ");
        myChar = tuhin.next().charAt(0);
        System.out.print("Enter a long value: ");
        myLong = tuhin.nextLong();
        System.out.print("Enter a boolean value (true or false) value: ");
        is_correct = tuhin.nextBoolean();
        System.out.print("Enter a byte value: ");
        myByte = tuhin.nextByte();
        System.out.print("Enter a short value: ");
        myShort = tuhin.nextShort();
        System.out.print("Enter a float value: ");
        myFloat = tuhin.nextFloat();


        tuhin.close();

        // in python if we want to concatenate 2 different variables
        // we must need to use comma(,) but in java every where
        // we can use plus(+).

        System.out.println(first + "\n" + last + "\n" + fullName);
        System.out.println(is_correct + "\n" + myChar );
        System.out.println(myByte + "\n" + myShort + "\n" + myInt + "\n" + myLong);
        System.out.println(myFloat + "\n" + myDouble);
    }
}

