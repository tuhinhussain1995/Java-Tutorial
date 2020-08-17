package ProtectedSamePackage;

import ProtectedDifferentPackage.ProtectedAMDifferentPackageExtended;

public class ProtectedAMSamePackage {

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
