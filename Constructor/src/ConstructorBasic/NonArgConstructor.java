package ConstructorBasic;

public class NonArgConstructor {
    int a;                              // default access modifier
    private boolean b;                  // private access modifier
    protected float c;                  // protected access modifier
    public String d;                    // public access modifier

    private NonArgConstructor(){        // We can create this class object only within this class. Because Constructor is private.
        this.a = 0;
        this.b = false;
        this.c = 556.34f;
        this.d = "Tuhin";

        System.out.println("Non-Arg Constructor is called.");

        System.out.println("a = " + this.a);
        System.out.println("b = " + this.b);
    }


    public static void display(){
        NonArgConstructor obj = new NonArgConstructor();

        System.out.println("a = " + obj.c);
        System.out.println("b = " + obj.d);
    }
}
