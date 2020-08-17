package PublicSamePackage;

import PublicDifferentPackage.PublicAMDifferentPackageExtended;

public class PublicAMSamePackage {

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
