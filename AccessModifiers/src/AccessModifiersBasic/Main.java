package AccessModifiersBasic;


import DefaultSamePackage.*;
import PrivateSameClass.*;
import ProtectedDifferentPackage.*;
import ProtectedSamePackage.*;
import PublicDifferentPackage.*;
import PublicSamePackage.*;

public class Main{

    public static void main(String[] args) {

// Private:
        PrivateAM.sameClass();


// Default:
        DefaultAM.sameClass();
        DefaultAM.samePackageExtended();

        DefaultAMSamePackage.sameClass();
        DefaultAMSamePackage.samePackageExtended();

        DefaultAMSamePackageExtended.sameClass();
        DefaultAMSamePackageExtended.samePackageExtended();


// Protected:
        ProtectedAM.sameClass();
        ProtectedAM.samePackageExtended();
        ProtectedAM.differentPackageExtended();

        ProtectedAMSamePackage.sameClass();
        ProtectedAMSamePackage.samePackageExtended();
        ProtectedAMSamePackage.differentPackageExtended();

        ProtectedAMSamePackageExtended.sameClass();
        ProtectedAMSamePackageExtended.samePackageExtended();
        ProtectedAMSamePackageExtended.differentPackageExtended();

        ProtectedAMDifferentPackageExtended.differentPackageExtended();


// Public:
        PublicAM.sameClass();
        PublicAM.samePackageExtended();
        PublicAM.differentPackageExtended();

        PublicAMSamePackage.sameClass();
        PublicAMSamePackage.samePackageExtended();
        PublicAMSamePackage.differentPackageExtended();

        PublicAMSamePackageExtended.sameClass();
        PublicAMSamePackageExtended.samePackageExtended();
        PublicAMSamePackageExtended.differentPackageExtended();

        PublicAMDifferentPackage.sameClass();
        PublicAMDifferentPackage.samePackageExtended();
        PublicAMDifferentPackage.differentPackageExtended();

        PublicAMDifferentPackageExtended.sameClass();
        PublicAMDifferentPackageExtended.samePackageExtended();
        PublicAMDifferentPackageExtended.differentPackageExtended();


//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////



// Basic:

        // We can use Access modifiers with everything.
        // access modifiers are used to set the accessibility (visibility) of classes, interfaces, abstract,
        // variables, abstract methods, non-abstract methods, constructors, data members, and getter, setter methods.

        // Access modifiers are mainly used for encapsulation.
        // It can help us to control what part of a program can access the members of a class. So that misuse of data can be prevented.

        // We cannot declare classes and interfaces private in Java.


// 4 type of access modifiers are:

        // Private ========> visible within the same class only
                // In order to access the variable from the outer class, we have used methods: getName() and setName(). These methods are called getter and setter in Java.
                // setter method (setName()) to assign value to the variable.
                // getter method (getName()) to access the variable.

        // Default ========> visible only within the same class or same package only
                // If we do not explicitly specify any access modifier for classes, methods, variables, etc, then it is considered as default access modifier.

        // Protected ======> visible within the same class or same package or all different package(subclasses).


        // Public =========> visible everywhere




// Access Modifiers:

        // Access Modifier ---- within class ---- within package ---- outside package by (subclass only) ----	outside package
        // Private  ---------------- Y -------------- N -------------------------- N ----------------------------- N
        // Default	---------------- Y -------------- Y	-------------------------- N ----------------------------- N
        // Protected --------------- Y -------------- Y	-------------------------- Y ----------------------------- N
        // Public ------------------ Y -------------- Y	-------------------------- Y ----------------------------- Y



    }
}
