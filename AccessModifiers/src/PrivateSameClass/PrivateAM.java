package PrivateSameClass;

// Private visible within:
        // same class only

public class PrivateAM {
    private static String myStaticString = "Tuhin";
    private int myIntValue = 33;


    private static void staticMethod() {
        System.out.println("Hossain Md Tuhin");
    }


    private void voidMethod() {
        System.out.println("How are you doing?");
    }


    private int intMethod(){
        return myIntValue;
    }


    @Override
    public String toString(){              // toString is return type method and must be public
        return this.myStaticString + " ===> " + this.myIntValue ;
    }


////////////////////////////////////////////////////////////////////////////////////////////////////////////////


    public static void sameClass(){                 //////////// used by Same Class
        PrivateAM.myStaticString = "Nazrul";
        PrivateAM.staticMethod();

        PrivateAM myObj = new PrivateAM();

        myObj.myIntValue = 565;

        myObj.voidMethod();
        System.out.println(myObj.intMethod());
        System.out.println(myObj.toString());
    }
}
