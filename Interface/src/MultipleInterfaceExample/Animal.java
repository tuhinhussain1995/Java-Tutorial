package MultipleInterfaceExample;

public interface Animal {
    String desc = " is from Animal";     // public static final String desc = "Animal can eat and move";
    int totalHead = 1;                           // public static final int totalHead = 1;
    boolean isIntelligent = true;                // public static final boolean isIntelligent = true;


    void makeSound();                           // public abstract void makeSound();
    double move();                              // public abstract double move();
}
