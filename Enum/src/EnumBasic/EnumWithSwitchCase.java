package EnumBasic;

enum Day {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY,
    THURSDAY, FRIDAY, SATURDAY
}

public class EnumWithSwitchCase {
    Day day;

    public EnumWithSwitchCase(Day day){
        this.day = day;
    }


    public void dayIsLike(){
        switch (day){
            case MONDAY:
                System.out.println("Mondays are bad.");
                break;
            case FRIDAY:
                System.out.println("Fridays are better.");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("Weekends are best.");
                break;
            default:
                System.out.println("Midweek days are so-so.");
                break;
        }
    }


    public static void display(){
        String str = "MONDAY";
        EnumWithSwitchCase t1 = new EnumWithSwitchCase(Day.valueOf(str));

        t1.dayIsLike();
    }
}
