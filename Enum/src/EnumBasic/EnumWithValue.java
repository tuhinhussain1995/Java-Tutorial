package EnumBasic;

public class EnumWithValue {
    public enum Season{
        Winter(2),
        Spring(1),
        Summer(4),
        Rainy(2),
        Fall(2),
        Autum(1);

        private int val;

        private Season(int v){
            this.val = v;
        }
    }

    public static void display(){

// First:
        System.out.println(Season.Spring);
        System.out.println(Season.Spring.val);

// Second:
        Season currentSeason = Season.Summer;
        System.out.println(currentSeason);

        int currentSeason1 = Season.Summer.val;
        System.out.println(currentSeason1);

// Third:
        Season now = Season.valueOf("Summer");
        System.out.println(now);

        Season now1 = Season.valueOf("Summer");
        System.out.println(now1.val);

        int now2 = Season.valueOf("Summer").val;
        System.out.println(now2);

// Forth:
        for (Season mySeason : Season.values()){
            System.out.println(mySeason);
        }

        for (Season mySeason : Season.values()){
            System.out.println(mySeason.val);
        }


///////////////////////////////// Methods //////////////////////////////////

// valueOf(): ----- valueOf() method takes a string and returns an enum constant having the same string name.
        System.out.println("Value of Winter is: " + Season.valueOf("Winter"));
        System.out.println("Value of Winter is: " + Season.valueOf("Winter").val);


// values(): ----- values() method returns an array of enum type containing all the enum constants.
        for (Season mySeason : Season.values()){
            System.out.println(mySeason);
        }

        for (Season mySeason : Season.values()){
            System.out.println(mySeason.val);
        }

// ordinal(): ------- ordinal() method returns the position of an enum constant
        System.out.println("Index of Autum is: " + Season.Autum.ordinal());
        System.out.println("Index of Fall is: " + Season.valueOf("Fall").ordinal());


// compareTo(): ----- compareTo() method compares the enum constants based on their ordinal value.
        System.out.println(Season.Summer.compareTo(Season.Fall));


// toString():
        System.out.println(Season.valueOf("Rainy").toString());
        System.out.println(Season.valueOf("Rainy").toString().toLowerCase());
        System.out.println(Season.valueOf("Rainy").toString().toUpperCase());
    }
}
