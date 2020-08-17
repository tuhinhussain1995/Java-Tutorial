package DefaultSamePackage;

public class DefaultAMSamePackage {

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
