package PublicSamePackage;

// Public visible within:
        // same class
        // same package
        // different package.

import PublicDifferentPackage.PublicAMDifferentPackageExtended;

public class PublicAM {

    public static String myStaticString = "Tuhin";
    public int myIntValue = 33;


    public static void staticMethod() {
        System.out.println("Hossain Md Tuhin");
    }


    public void voidMethod() {
        System.out.println("How are you doing?");
    }


    public int intMethod(){
        return myIntValue;
    }


    @Override
    public String toString(){              // toString is return type method and must be public
        return this.myStaticString + " ===> " + this.myIntValue ;
    }


/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


    public static void sameClass(){                 //////////// used by Same Class
        PublicAM.myStaticString = "Nazrul";
        PublicAM.staticMethod();

        PublicAM myObj = new PublicAM();

        myObj.myIntValue = 565;

        myObj.voidMethod();
        System.out.println(myObj.intMethod());
        System.out.println(myObj.toString());
    }


    public static void samePackageExtended(){                  ///////////// used by Same Package Extended
        PublicAMSamePackageExtended.myStaticString = "Nazrul";
        PublicAMSamePackageExtended.staticMethod();

        PublicAMSamePackageExtended myObj = new PublicAMSamePackageExtended();

        myObj.myIntValue = 565;

        myObj.voidMethod();
        System.out.println(myObj.intMethod());
        System.out.println(myObj.toString());
    }


    public static void differentPackageExtended(){                 ////////////// used by Different Package Extended
        PublicAMDifferentPackageExtended.myStaticString = "Kawsar";
        PublicAMDifferentPackageExtended.staticMethod();

        PublicAMDifferentPackageExtended myObj = new PublicAMDifferentPackageExtended();

        myObj.myIntValue = 565;

        myObj.voidMethod();
        System.out.println(myObj.intMethod());
        System.out.println(myObj.toString());
    }

}
