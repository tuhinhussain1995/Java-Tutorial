package udemySection06;

// multiple methods can have the same name with different parameters.

// ()     ----- only one time, even it is return type or non return type.
// (String name)
// (int score) or (float score) or (short score) or (double score) or (byte score) or (long score)
// (String name, int score) or (String name, float score) or (String name, long score)

public class BasicOverloading {

    public static void calculateScore(){
        System.out.println("Player has no name and no score");
    }

    public static void calculateScore(String name){
        System.out.println("Player name: " + name + " , But has no score");
    }

    public static int calculateScore(int score){
        System.out.println("No player name, but score is: " + score);
        return score;
    }


    public static void calculateScore(String name, int score){
        System.out.println("Player name: " + name + " , And score: " + score);
    }

    public static float calculateScore(String name, float score){
        System.out.println("Player name: " + name + " , And score: " + score);
        return score;
    }


    public static void display(String a, int b){
        calculateScore();
        calculateScore(a);
        calculateScore(a, b);
        calculateScore(b);
        calculateScore(a, b);
    }

}
