package ThisBasic;

public class ThisWithGetterAndSetter {

    String name;

    void setName( String name ) {
        this.name = name;
    }

    String getName(){
        return this.name;
    }

    @Override
    public String toString(){            // toString is return type method and must be public
        return "Name: " + this.name;
    }

    public static void display(){
        ThisWithGetterAndSetter obj = new ThisWithGetterAndSetter();

        obj.setName("Nazrul");
        System.out.println(obj.getName());

        System.out.println(obj);         // When we print out the object, it actually print out the toString
    }
}


    // getter =========> to access value inside the getter method
    // setter =========> to assign value inside the setter method

