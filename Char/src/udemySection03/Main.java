package udemySection03;

public class Main {

    public static void main(String[] args) {
        String string1 = "MEDIU\u00AE All resurved here ";
        String string2 = string1 + "\u00A9 2015";

        System.out.println(string2);

// char to char:
        char a = 'A';
        char c = (char) (a + 2);
        System.out.println(c);

        char e = (char) ('\u0044' + 1);
        System.out.println(e);

// char to int:
        char zero = '0';
        int intZero = (int) zero;
        System.out.println(intZero);

        char d = '\u0044';
        System.out.println(d);
        int charD = (int) d;
        System.out.println(charD);

        int charB = (int) ('\u0044' + 1);
        System.out.println(charB);

        int charC = (int) ('B' + 1);
        System.out.println(charC);
    }
}
