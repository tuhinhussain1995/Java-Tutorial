package ConstructorBasic;

public class ParameterizedConstructor {

    int a;                              // default access modifier
    private boolean b;                  // private access modifier
    protected float c;                  // protected access modifier
    public String d;                    // public access modifier

    public ParameterizedConstructor(int aa, boolean bb, float cc, String dd){
        this.a = aa;
        this.b = bb;
        this.c = cc;
        this.d = dd;

        System.out.println("Non-Arg Constructor is called.");

        System.out.println("a = " + this.a);
        System.out.println("b = " + this.b);
    }


    public static void display(){
        ParameterizedConstructor obj = new ParameterizedConstructor(45, true, 64.23f, "Nazrul");

        System.out.println("a = " + obj.c);
        System.out.println("b = " + obj.d);
    }

}

