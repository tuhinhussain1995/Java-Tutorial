package udemySection06;

public class SwitchOverloading {

    public static void switchInput(int input){
        switch(input){
            case 1:
                System.out.println("You selected first choice");
                break;
            case 2:
                System.out.println("You selected second choice");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("You selected third or forth or fifth choice");
                break;
            default:
                System.out.println("Nothing Matched");
                break;
        }
    }

    public static void switchInput(char input){

        input = Character.toUpperCase(input);

        switch(input){
            case 'A':
                System.out.println("You selected first choice");
                break;
            case 'B':
                System.out.println("You selected second choice");
                break;
            case 'C':
            case 'D':
            case 'E':
                System.out.println("You selected third or forth or fifth choice");
                break;
            default:
                System.out.println("Nothing Matched");
                break;
        }
    }

    public static void switchInput(String input){

        input = input.toLowerCase();

        switch(input){
            case "one":
                System.out.println("You selected first choice");
                break;
            case "two":
                System.out.println("You selected second choice");
                break;
            case "three":
            case "four":
            case "five":
                System.out.println("You selected third or forth or fifth choice");
                break;
            default:
                System.out.println("Nothing Matched");
                break;
        }
    }
}
