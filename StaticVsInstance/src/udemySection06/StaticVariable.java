package udemySection06;

public class StaticVariable {
    private static String name;

    public StaticVariable(String name){
        StaticVariable.name = name;           // for static we can't use this keyword.
    }

    public void printName(){
        System.out.println("Dog name: " + name);
    }

    public static int age = 25;
}
