package DefaultSamePackage;

// Default visible within:
        // same class
        // same package

public class DefaultAM {
    static String myStaticString = "Tuhin";
    int myIntValue = 33;


    static void staticMethod() {
        System.out.println("Hossain Md Tuhin");
    }


    void voidMethod() {
        System.out.println("How are you doing?");
    }


    int intMethod(){
        return myIntValue;
    }


    @Override
    public String toString(){              // toString is return type method and must be public
        return this.myStaticString + " ===> " + this.myIntValue ;
    }


////////////////////////////////////////////////////////////////////////////////////////////////////////////////


    public static void sameClass(){                 //////////// used by Same Class
        DefaultAM.myStaticString = "Nazrul";
        DefaultAM.staticMethod();

        DefaultAM myObj = new DefaultAM();

        myObj.myIntValue = 565;

        myObj.voidMethod();
        System.out.println(myObj.intMethod());
        System.out.println(myObj.toString());
    }

    public static void samePackageExtended(){                  ///////////// used by Same Package Extended
        DefaultAMSamePackageExtended.myStaticString = "Nazrul";
        DefaultAMSamePackageExtended.staticMethod();

        DefaultAMSamePackageExtended myObj = new DefaultAMSamePackageExtended();

        myObj.myIntValue = 565;

        myObj.voidMethod();
        System.out.println(myObj.intMethod());
        System.out.println(myObj.toString());
    }

}
