package SuperBasic;

public class SuperToCallSuperClassOverriddenAttribute {

    public static void display(){
        Dog1 dog1 = new Dog1();
        dog1.printType();
    }
}

////////////////////////////////////////////////////////////////////////////////////////////

class Animal1 {
    protected String type="animal";
}

class Dog1 extends Animal1 {
    public String type="mammal";

    public void printType() {
        System.out.println("I am a " + type);
        System.out.println("I am an " + super.type);
    }
}



        // Notice that, the type is declared protected in the Animal1 superclass.
        // The same attribute has the public access specifier in the Dog subclass1.
        // This is possible because the public provides larger access than the protected.