package udemySection06;

public class OverloadingPractice1 {

    public static double calcFeetInch2Cent(double feet, double inch) {
        if(feet >=0 && (inch >= 0 && inch <= 12)) {

            double totalCm = ((feet*12)+inch) * 2.54d;

            System.out.println(feet + (feet>1 ? " feets " : " feet ") +
                    inch + (inch>1 ? " inches = " : " inch = ") +
                        totalCm + (totalCm>1 ? " centimeters" : " centimeter"));

            return totalCm;
        }

        return -1;
    }

    public static double calcFeetInch2Cent(double inch) {
        if(inch >= 0) {
            double totalCm = inch * 2.54d;

            System.out.println(inch + (inch>1 ? " inches = " : " inch = ") +
                    totalCm + (totalCm>1 ? " centimeters" : " centimeter"));
            return totalCm;
        }

        return -1;
    }
}
