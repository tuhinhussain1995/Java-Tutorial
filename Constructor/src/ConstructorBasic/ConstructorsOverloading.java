package ConstructorBasic;

public class ConstructorsOverloading {
    int a;                              // default access modifier
    private boolean b;                  // private access modifier
    protected float c;                  // protected access modifier
    public String d;                    // public access modifier

    ConstructorsOverloading(){                   // default access modifiers
        this.a = 4;
        this.b = false;
        this.c = 56.34f;
        this.d = "No Name";
    }

    public ConstructorsOverloading(int aa){               // public access modifiers
        this.a = aa;
        this.b = false;
        this.c = 56.34f;
        this.d = "No Name";
    }

    private ConstructorsOverloading(int aa, boolean bb){               // private access modifiers
        this.a = aa;
        this.b = bb;
        this.c = 56.34f;
        this.d = "No Name";
    }

    protected ConstructorsOverloading(int aa, boolean bb, float cc){              // protected access modifiers
        this.a = aa;
        this.b = bb;
        this.c = cc;
        this.d = "No Name";
    }

    private ConstructorsOverloading(int aa, boolean bb, float cc, String dd){           // private access modifiers
        this.a = aa;
        this.b = bb;
        this.c = cc;
        this.d = dd;
    }

    protected void printAll(){
        System.out.println("a = " + this.a);
        System.out.println("b = " + this.b);
        System.out.println("a = " + this.c);
        System.out.println("b = " + this.d);
    }


    public static void display(){
        ConstructorsOverloading obj1 = new ConstructorsOverloading();
        ConstructorsOverloading obj2 = new ConstructorsOverloading(65);
        ConstructorsOverloading obj3 = new ConstructorsOverloading(45, true);
        ConstructorsOverloading obj4 = new ConstructorsOverloading(45, true, 64.23f);
        ConstructorsOverloading obj5 = new ConstructorsOverloading(45, true, 64.23f, "Nazrul");

        obj1.printAll();
        obj2.printAll();
        obj3.printAll();
        obj4.printAll();
        obj5.printAll();
    }
}
