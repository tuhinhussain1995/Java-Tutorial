package udemySection03;

// boolean is_correct;   // (true or false, 1 bit)

public class Main {

    public static void main(String[] args) {

        boolean trueFalse1 = true;
        System.out.println(trueFalse1);

        boolean trueFalse2 = trueFalse1 ? false : true;
        System.out.println(trueFalse2);


// The main target of condition statement (inside parenthesis) is to verify is the condition true or false.
// If true then run this statement, if false skip it;


// first way: (is the condition true)
        if(trueFalse1){
            System.out.println("It is true");
        }

// second way: (is the condition true)  (! false = true)
        if(!trueFalse2){
            System.out.println("It is False");
        }

// third way: (is the condition true)
        if(trueFalse2 == false){
            System.out.println("It is false");
        }

// forth way: (is the condition true)
        String myResult = trueFalse1 ? "Passed" : "Failed";

        System.out.println("You are " + myResult);

// fifth way: (is the condition true)
        int age = 20;
        boolean trueFalse3 = (age >= 18) ? true : false;
        String access = trueFalse3 ? "You can access" : "You can't access";

        System.out.println(access);

// sixth way: (is the condition true)
        float pound = 3.5f;
        float kg = pound * .453592f;

        System.out.println(pound + " " + ((pound > 1) ? "pound's" : "pound") + " = " + kg + " " + ((kg >1) ? "kg's" : "kg"));
    }
}
