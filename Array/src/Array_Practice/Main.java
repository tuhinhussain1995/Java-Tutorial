package Array_Practice;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){


        System.out.print("Enter Student name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Number of subject: ");
        int subjects = scanner.nextInt();

        float[] subjectsMark = setAndGetMarks(subjects);

        System.out.println("Student name: " + name);
        printMarks(subjectsMark);

        printSortedMark(sortedMarks(subjectsMark));
    }

    public static float[] setAndGetMarks(int sub){
        float[] marks = new float[sub];

        for (int i=0; i<marks.length; i++){
            System.out.print("No " + (i+1) + " subject mark: ");
            marks[i] = scanner.nextFloat();
        }
        return marks;
    }

    public static void printMarks(float[] marks){
        for (int i=0; i<marks.length; i++){
            System.out.println("Subject " + (i+1) + " marks: " + marks[i]);
        }
    }

    public static float[] sortedMarks(float[] marks){
        float[] sortedArray = Arrays.copyOf(marks, marks.length);
        // or float[] sortedArray = marks;

        boolean flag = true;
        float temp;

        while (flag) {
            flag = false;

            for (int i = 0; i < sortedArray.length - 1; i++) {
                if (sortedArray[i+1] > sortedArray[i]){
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i+1] = temp;
                    flag = true;
                }
            }
        }
        return sortedArray;
    }

    public static void printSortedMark(float[] myArray){
        for (int i=0; i<myArray.length; i++){
            System.out.println((i+1) + " marks: " + myArray[i]);
        }
    }
}
