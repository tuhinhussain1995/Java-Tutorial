package StreamBasic;

import java.util.*;
import java.util.stream.*;

import java.lang.Math;

// The features of Java stream are –
        //A stream is not a data structure instead it takes input from the Collections, Arrays or I/O channels.
        //Streams don’t change the original data structure, they only provide the result as per the pipelined methods.
        //Each intermediate operation is lazily executed and returns a stream as a result, hence various intermediate operations can be pipelined. Terminal operations mark the end of the stream and return the result.

public class Main {

    public static void main(String[] args) {

/////////////////////////////////////////////////////////////////////////////////////////
/////////////////////// Intermediate Operations  ////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////

// map: The map method is used to returns a stream consisting of the results of applying the given function to the elements of this stream.
        List<Integer> number = Arrays.asList(2,3,4,5,6,7);

        // List:
        List<Integer> square = number.stream().map(x -> x*x).collect(Collectors.toList());
        System.out.println(square);

        // Set:
        Set<Double> Quebe = number.stream().map(x -> Math.pow(x, 3)).collect(Collectors.toSet());
        System.out.println(Quebe);


// filter: The filter method is used to select elements as per the Predicate passed as argument.
        List<String> names = Arrays.asList("Reflection","Collection","Stream");

        // List:
        List<String> result = names.stream().filter(s->s.startsWith("S")).collect(Collectors.toList());
        System.out.println(result);

        // Set:
        Set<Integer> myEven = number.stream().filter(x->x%2==0).collect(Collectors.toSet());
        System.out.println(myEven);


// sorted: The sorted method is used to sort the stream.
        List<String> show = names.stream().sorted().collect(Collectors.toList());
        System.out.println(show);


        List<Integer> number3 = Arrays.asList(5,6,3,7,22,44,1,3);
        Set<Integer> inti = number3.stream().sorted().collect(Collectors.toSet());
        System.out.println(inti);

/////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////  Terminal Operations  ////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////


// collect: The collect method is used to return the result of the intermediate operations performed on the stream.
        List<Integer> square1 = number.stream().map(x -> x*x).collect(Collectors.toList());
        System.out.println(square1);


// forEach: The forEach method is used to iterate through every element of the stream.
    // forEach returns void.
        number.stream().map(x->x*x).forEach(y->System.out.println(y));


        List<Integer> numberr = Arrays.asList(2,3,4,5,6,7);
        numberr.stream().map(x->x*x).forEach(y->System.out.println(y));


// reduce: The reduce method is used to reduce the elements of a stream to a single value. The reduce method takes a BinaryOperator as a parameter.
        // if even then add all even number:
        int even = number.stream().filter(x->x%2==0).reduce(0,(ans,i)-> ans+i);
        System.out.println(even);


    }
}
