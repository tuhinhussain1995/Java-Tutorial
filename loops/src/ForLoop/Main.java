package ForLoop;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<Integer>();

        for(int i = 1; i < 11; i++) {
            numbers.add(i);
        }

        for(int n : numbers) {
            System.out.println(n);
        }

    }
}
