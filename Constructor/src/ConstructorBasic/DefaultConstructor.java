package ConstructorBasic;

public class DefaultConstructor {
    int a;                              // default access modifier
    private boolean b;                  // private access modifier
    protected float c;                  // protected access modifier
    public String d;                    // public access modifier


    public static void display(){
        DefaultConstructor obj = new DefaultConstructor();      // The default constructor will called automatically.

        System.out.println("a = " + obj.a);
        System.out.println("b = " + obj.b);
        System.out.println("a = " + obj.c);
        System.out.println("b = " + obj.d);
    }

}


// The default constructor initializes any uninitialized instance variables with default values.
// Default Array values.
        // boolean ----------- false
        // byte -------------- 0
        // short ------------- 0
        // int --------------- 0
        // long -------------- 0L
        // char -------------- \u0000
        // float ------------- 0.0f
        // double ------------ 0.0d
        // String ------------ null
        // bject ------------- Reference null