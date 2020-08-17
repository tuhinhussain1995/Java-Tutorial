package ProtectedSamePackage;

// Protected visible within:
        // same class
        // same package
        // different package (subclasses).

import ProtectedDifferentPackage.ProtectedAMDifferentPackageExtended;

public class ProtectedAM {

    protected static String myStaticString = "Tuhin";
    protected int myIntValue = 33;


    protected static void staticMethod() {
        System.out.println("Hossain Md Tuhin");
    }


    protected void voidMethod() {
        System.out.println("How are you doing?");
    }


    protected int intMethod(){
        return myIntValue;
    }


    @Override
    public String toString(){              // toString is return type method and must be public
        return this.myStaticString + " ===> " + this.myIntValue ;
    }


////////////////////////////////////////////////////////////////////////////////////////////////////////////////


    public static void sameClass(){                 //////////// used by Same Class
        ProtectedAM.myStaticString = "Nazrul";
        ProtectedAM.staticMethod();

        ProtectedAM myObj = new ProtectedAM();

        myObj.myIntValue = 565;

        myObj.voidMethod();
        System.out.println(myObj.intMethod());
        System.out.println(myObj.toString());
    }

    public static void samePackageExtended(){                  ///////////// used by Same Package Extended
        ProtectedAMSamePackageExtended.myStaticString = "Nazrul";
        ProtectedAMSamePackageExtended.staticMethod();

        ProtectedAMSamePackageExtended myObj = new ProtectedAMSamePackageExtended();

        myObj.myIntValue = 565;

        myObj.voidMethod();
        System.out.println(myObj.intMethod());
        System.out.println(myObj.toString());
    }


    public static void differentPackageExtended(){                ////////////// used by Different Package Extended
        ProtectedAMDifferentPackageExtended.myStaticString = "Kawsar";
        ProtectedAMDifferentPackageExtended.staticMethod();

        ProtectedAMDifferentPackageExtended myObj = new ProtectedAMDifferentPackageExtended();

        myObj.myIntValue = 565;

        myObj.voidMethod();
        System.out.println(myObj.intMethod());
        System.out.println(myObj.toString());
    }

}
