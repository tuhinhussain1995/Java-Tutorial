package EnumBasic;

public class EnumWithoutValue {

    public enum Season{
        Winter,
        Spring,
        Summer,
        Rainy,
        Fall,
        Autum
    }

    public static void display(){

// First:
        System.out.println(Season.Spring);

// Second:
        Season currentSeason = Season.Summer;
        System.out.println(currentSeason);

// Third:
        Season now = Season.valueOf("Summer");
        System.out.println(now);

// Forth:
        for (Season mySeason : Season.values()){
            System.out.println(mySeason);
        }

////////////////////////// Methods ///////////////////////////////////

// valueOf(): ----- valueOf() method takes a string and returns an enum constant having the same string name.
        System.out.println("Value of Winter is: " + Season.valueOf("Winter"));


// values(): ------- values() method returns an array of enum type containing all the enum constants.
        for (Season mySeason : Season.values()){
            System.out.println(mySeason);
        }


// ordinal(): ------ ordinal() method returns the position of an enum constant
        System.out.println("Index of Autum is: " + Season.Autum.ordinal());
        System.out.println("Index of Fall is: " + Season.valueOf("Fall").ordinal());


// compareTo(): ------- compareTo() method compares the enum constants based on their ordinal value.
        System.out.println(Season.Summer.compareTo(Season.Fall));


// toString():
        System.out.println(Season.valueOf("Rainy").toString());
        System.out.println(Season.valueOf("Rainy").toString().toLowerCase());
        System.out.println(Season.valueOf("Rainy").toString().toUpperCase());
    }
}
