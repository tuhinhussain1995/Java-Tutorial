package ProtectedDifferentPackage;

import ProtectedSamePackage.ProtectedAM;

public class ProtectedAMDifferentPackageExtended extends ProtectedAM {

    public static void differentPackageExtended(){                ////////////// used by Different Package Extended only
        ProtectedAMDifferentPackageExtended.myStaticString = "Kawsar";
        ProtectedAMDifferentPackageExtended.staticMethod();

        ProtectedAMDifferentPackageExtended myObj = new ProtectedAMDifferentPackageExtended();

        myObj.myIntValue = 565;

        myObj.voidMethod();
        System.out.println(myObj.intMethod());
        System.out.println(myObj.toString());
    }
}
