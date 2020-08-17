package references;

import java.util.Arrays;

// Reference is the memory address of object or array. By using new keyword, a new memory location is created.

    // Person sally = new Person();

    // Person => name of class
    // sally => object name
    // new => allocate memory
    // Person() => constructor

public class Main {

    public static void main(String[] args) {
	    int intValue = 10;
	    int anotherIntValue = intValue;

        System.out.println("intValue: " + intValue);
        System.out.println("anotherIntValue: " + anotherIntValue);

        anotherIntValue++;

        System.out.println("intValue: " + intValue);
        System.out.println("anotherIntValue: " + anotherIntValue);

        int[] intArray = new int[5];
	    int[] anotherIntArray = intArray;

        System.out.println("intArray1" + Arrays.toString(intArray));
        System.out.println("anotherIntArray1: " + Arrays.toString(anotherIntArray));

        anotherIntArray[1] = 44;

        System.out.println("intArray2: " + Arrays.toString(intArray));
        System.out.println("anotherIntArray2: " + Arrays.toString(anotherIntArray));

        intArray[1] = 100;

        System.out.println("intArray3: " + Arrays.toString(intArray));
        System.out.println("anotherIntArray3: " + Arrays.toString(anotherIntArray));

        anotherIntArray = new int[]{4, 5, 6, 7, 8};

        System.out.println("intArray4: " + Arrays.toString(intArray));
        System.out.println("anotherIntArray4: " + Arrays.toString(anotherIntArray));

        int[] loosenArray = intArray;
        intArray = new int[]{1, 2, 3, 4, 5};

        System.out.println("intArray5: " + Arrays.toString(intArray));
        System.out.println("anotherIntArray5: " + Arrays.toString(anotherIntArray));

        System.out.println("LoosenArray: " + Arrays.toString(loosenArray));



        int[] a = {1, 2, 3, 4, 5};    // or int[] a = new int[]{1, 2, 3, 4, 5};
        int[] b = a;

        System.out.println("a: " + Arrays.toString(a));
        System.out.println("b: " + Arrays.toString(b));

        b[1] = 100;

        System.out.println("a: " + Arrays.toString(a));
        System.out.println("b: " + Arrays.toString(b));

        int[] loosen = a;
        a = new int[] {6, 7, 8, 9};
        b = new int[] {11, 22, 33};

        System.out.println("a: " + Arrays.toString(a));
        System.out.println("b: " + Arrays.toString(b));
        System.out.println("loosen: " + Arrays.toString(loosen));

        System.out.println("\n");

        Customer customer = new Customer("Coffee", 10.50);
        Customer newCustomer = new Customer(customer.getProductName(), customer.getPrice());
        Customer anotherCustomer = customer;


        System.out.println("customer values: " + customer.getProductName() + " => " + customer.getPrice());
        System.out.println("newCustomer values: " + newCustomer.getProductName() + " => " + newCustomer.getPrice());
        System.out.println("anotherCustomer values: " + anotherCustomer.getProductName() + " => " + anotherCustomer.getPrice());

       newCustomer.setPrice(16.30);

        System.out.println("customer values: " + customer.getProductName() + " => " + customer.getPrice());
        System.out.println("newCustomer values: " + newCustomer.getProductName() + " => " + newCustomer.getPrice());
        System.out.println("anotherCustomer values: " + anotherCustomer.getProductName() + " => " + anotherCustomer.getPrice());

        anotherCustomer.setPrice(13.85);

        System.out.println("customer values: " + customer.getProductName() + " => " + customer.getPrice());
        System.out.println("newCustomer values: " + newCustomer.getProductName() + " => " + newCustomer.getPrice());
        System.out.println("anotherCustomer values: " + anotherCustomer.getProductName() + " => " + anotherCustomer.getPrice());
    }
}
