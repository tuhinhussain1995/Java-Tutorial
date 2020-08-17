package udemySection05;

    // only possible when string is consists of only using digits.

public class StringToIntAndDouble {
    public static void IntegerParseInt(){
        String numberAsString = "2019";
        int intNumber = Integer.parseInt(numberAsString);

        System.out.println("Number as String: " + (numberAsString + 1));
        System.out.println("Number From String: " + (intNumber + 1));
    }

    public static void DoubleParseDouble(){
        String numberAsString = "3.141598";
        double intNumber = Double.parseDouble(numberAsString);

        System.out.println("Number as String: " + (numberAsString + 1));
        System.out.println("Number From String: " + (intNumber + 1));
    }
}
