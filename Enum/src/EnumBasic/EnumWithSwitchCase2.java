package EnumBasic;

public class EnumWithSwitchCase2 {
    public enum Operation {
        PLUS,
        MINUS,
        TIMES,
        DIVIDE;

        double calculate(double x, double y) {
            switch (this) {
                case PLUS:
                    return x + y;
                case MINUS:
                    return x - y;
                case TIMES:
                    return x * y;
                case DIVIDE:
                    return x / y;
                default:
                    throw new AssertionError("Unknown operations " + this);
            }
        }
    }


    public static void display(){
        double result = Operation.DIVIDE.calculate(6, 4);

        System.out.println(result);
    }
}
