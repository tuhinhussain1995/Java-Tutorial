package udemySection05;

import java.util.*;

public class ArrayToList {
    public static void display(){
        String a[] = new String[] { "A", "B", "C", "D" };
        String d[] = new String[] { "I", "O"};
        // First:

        System.out.println(Arrays.asList(a));
        System.out.println(Arrays.asList(d));


        // Second:
        List<String> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(a));
        list2.addAll(Arrays.asList(d));
        System.out.println("String list is: " +list2);

        // Third:
        List<String> list3 = new ArrayList<>(Arrays.asList(a));
        list3.addAll(Arrays.asList(d));
        System.out.println("String list is: " +list3);




        Integer[] myInteger1 = new Integer[] { 10, 20, 30, 40 };
        Integer[] myInteger2 = new Integer[] { 1, 2, 3};

        // first:
        System.out.println(Arrays.asList(myInteger1));
        System.out.println(Arrays.asList(myInteger2));

        // Second:
        List<Integer> list5 = new ArrayList<>();
        list5.addAll(Arrays.asList(myInteger1));
        list5.addAll(Arrays.asList(myInteger2));
        System.out.println("Integer list is: " + list5);

        // Third;
        List<Integer> list6 = new ArrayList<>(Arrays.asList(myInteger1));
        list6.addAll(Arrays.asList(myInteger2));
        System.out.println("Integer list is: " + list6);




        Float myFloat1[] = new Float[]{3.4f, 5.3f, 11.44f};
        Float myFloat2[] = new Float[]{66.32f, 53.3f};

        // First:
        System.out.println(Arrays.asList(myFloat1));
        System.out.println(Arrays.asList(myFloat2));

        // Second:
        List<Float> list8 = new ArrayList<>();
        list8.addAll(Arrays.asList(myFloat1));
        list8.addAll(Arrays.asList(myFloat2));
        System.out.println("Float list is: "+ list8);

        // Third:
        List<Float> list9 = new ArrayList<>(Arrays.asList(myFloat1));
        list9.addAll(Arrays.asList(myFloat2));
        System.out.println("Float list is: "+ list9);



        Character myCharacter[] = new Character[]{'A', 'E', 'I', 'O', 'U'};
        List<Character> list10 = Arrays.asList(myCharacter);
        System.out.println("Character list is: " + list10);


        Boolean[] myBoolean = new Boolean[]{false, false, true, false};
        List<Boolean> list11 = new ArrayList<>();
        list11.addAll(Arrays.asList(myBoolean));
        System.out.println("Boolean list is: " + list11);


        Double myDouble[] = new Double[]{44.34d, 656.34d, 3.232d};
        List<Double> list12 = new ArrayList<>(Arrays.asList(myDouble));
        System.out.println("Double list is: " + list12);
    }
}
