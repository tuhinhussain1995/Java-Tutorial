package ArraysBasic;

import java.util.*;
import java.util.stream.IntStream;

public class Methods {

// toString(Array) ---------------------- String =============> This method returns a String representation of the contents of this Arrays.
// asList(Array) ------------------------ List ===============> This method returns a fixed-size list backed by the specified Arrays.
// binarySearch(Array, Key) ------------- index no ===========> These methods searches for the specified element in the array with the help of Binary Search algorithm.
// binarySearch(Array, from, to, key) --- index no ===========> This method searches a range of the specified array for the specified object using the binary search algorithm.
// sort(Array) -------------------------- Array ==============> This method sorts the complete array in ascending order.
// sort(Array, from, to) ---------------- Array ==============> This method sorts the specified range of array in ascending order.
// parallelSort(Array) ------------------ Array ==============> This method sorts the specified array using parallel sort.
// deepToString(Array) ------------------ String =============> This method returns a string representation of the “deep contents” of the specified Arrays.
// copyOf(Array, newLength) ------------- Array ==============> This method copies the specified array, truncating or padding with the default value (if necessary) so the copy has the specified length.
// copyOfRange(Array, from, length) ----- Array ==============> This method copies the specified range of the specified array into a new Arrays.
// equals(Array, Array) ----------------- Boolean ============> This method returns true if the two specified arrays are deeply equal to one another.
// deepEquals(Array, Arra) -------------- Boolean ============> This method returns true if the two specified arrays are deeply equal to one another.
// hashCode(Array) ---------------------- int ================> This method returns an integer hashCode of this array instance.
// deepHashCode(Array) ------------------ int ================> This method returns a hash code based on the “deep contents” of the specified Arrays.
// fill(Array, key) --------------------- Array ==============> This method assigns this fillValue to each index of this Arrays.
// compare(Array, Array) ---------------- int ================> if both are sequentially same return 0, else return -1
// mismatch(Array, Array) --------------- int ================> return index number from where the values are sequentially unmatched.
// spliterator(Array) ------------------- spliterator ========> This method returns a Spliterator covering all of the specified Arrays.
// spliterator(Array, start, end) ------- spliterator ========> This method returns a Spliterator of the type of the array covering the specified range of the specified Arrays.
// stream(Array) ------------------------ stream =============> This method returns a sequential stream with the specified array as its source.


    public static void arraysToString(){
        int[] intArr = { 10, 20, 15, 22, 35, 4, 22 };

        System.out.println(Arrays.toString(intArr));
    }


    public static void arraysAsList(){
        Integer[] intArr = { 10, 20, 15, 22, 35 };

        ArrayList<Integer> myArrayInt = new ArrayList<>(Arrays.asList(intArr));
        System.out.println(myArrayInt);
    }


    public static void arraysBinarySearch(){
        int[] intArr = { 10, 20, 15, 22, 35 };

        int intKey = 22;

        System.out.println(intKey + " found at index = " + Arrays.binarySearch(intArr, intKey));
    }


    public static void arraysBinarySearchUsingIndex(){
        int intArr[] = { 10, 20, 15, 22, 35 };

        int intKey = 22;

        System.out.println(intKey + " found at index = " + Arrays.binarySearch(intArr, 1, 3, intKey));
    }


    public static void arraysSort(){
        int[] intArr = { 10, 20, 15, 22, 35, 4, 22 };
        Arrays.sort(intArr);

        System.out.println(Arrays.toString(intArr));
    }


    public static void arraysSortUsingIndex(){
        int intArr[] = { 10, 20, 15, 22, 35 };

        Arrays.sort(intArr, 1, 3);

        System.out.println("Integer Array: " + Arrays.toString(intArr));
    }


    public static void arraysParallelSort(){
        int intArr[] = { 10, 20, 15, 22, 35 };

        Arrays.parallelSort(intArr);

        System.out.println("Integer Array: " + Arrays.toString(intArr));
    }


    public static void arraysDeepToString(){
        int intArr[][] = {{ 10, 20, 15, 22, 35 }};

        System.out.println("Integer Array: " + Arrays.deepToString(intArr));
    }


    public static void arraysCopyOf(){
        int[] source = {2, 3, 12, 4, 12, -2};

        int[] destination1 = Arrays.copyOf(source, 10);
        System.out.println("destination1 = " + Arrays.toString(destination1));
    }


    public static void arraysCopyOfRange(){
        int[] source = {2, 3, 12, 4, 12, -2};

        int[] destination1 = Arrays.copyOfRange(source, 0, source.length);
        System.out.println("destination1 = " + Arrays.toString(destination1));
    }


    public static void arraysEquals(){
        int intArr[] = { 10, 20, 15, 22, 35 };
        int[] source = {2, 3, 12, 4, 12, -2};

        System.out.println(Arrays.equals(intArr, source));
    }


    public static void arraysDeepEquals(){
        int intArr[][] = { { 10, 20, 15, 22, 35 } };
        int intArr1[][] = { { 10, 15, 22 }};

        System.out.println("Integer Arrays on comparison: " + Arrays.deepEquals(intArr, intArr1));
    }


    public static void arraysHashCode(){
        int intArr[] = { 10, 20, 15, 22, 35 };

        System.out.println(Arrays.hashCode(intArr));
    }


    public static void arraysDeepHashCode(){
        int intArr[][] = { { 10, 20, 15, 22, 35 }};

        System.out.println("Integer Array: " + Arrays.deepHashCode(intArr));
    }


    public static void arraysFill(){
        int intArr[] = { 10, 20, 15, 22, 35 };
        int intKey = 22;

        Arrays.fill(intArr, intKey);

        System.out.println("Integer Array on filling: " + Arrays.toString(intArr));
    }


    public static void arraysCompare(){                     // if both are sequentially same return 0, else return -1
        int intArr[] = {10, 20, 15, 22, 35};
        int intArr1[] = {10, 20, 15, 22, 35};

        System.out.println("Integer Arrays on comparison: " + Arrays.compare(intArr, intArr1));
    }


    public static void arraysMismatch(){                       // return index number from where the values are sequentially unmatched.
        int intArr[] = { 10, 20, 15, 22, 35 };
        int intArr1[] = { 10, 20, 22 };

        System.out.println("The element mismatched at index: " + Arrays.mismatch(intArr, intArr1));
    }


    public static void arraysSpliterator(){
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        Spliterator<Integer> s1 = Arrays.spliterator(arr);

        s1.forEachRemaining(System.out::println);
    }


    public static void arraysSpliteratorUsingIndex(){
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        Spliterator<Integer> s1 = Arrays.spliterator(arr, 3, 6);

        s1.forEachRemaining(System.out::println);
    }


    public static void arraysStream(){
        int arr[] = { 1, 2, 3, 4, 5 };

        IntStream stream = Arrays.stream(arr);

        stream.forEach(str -> System.out.print(str + " "));
    }

}
