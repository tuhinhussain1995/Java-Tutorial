package ThisBasic;

public class ThisInConstructorOverloading {

    private String name;
    private int age;

    private ThisInConstructorOverloading( String i, int j ){
        this.name = i;             // name = i
        this.age = j;              // age = j
    }

    private ThisInConstructorOverloading(String i){
        this.name = i;             // name = i
    }

    public ThisInConstructorOverloading() {
        // This is default constructor.
        // If we overload the constructor we should to declare this default constructor.
    }


    @Override
    public String toString(){              // toString is return type method and must be public
        return "Name: " + this.name + " & Age: " + this.age;
    }


    public static void display(){
        ThisInConstructorOverloading c1 = new ThisInConstructorOverloading("Mhafuz", 22);
        ThisInConstructorOverloading c2 = new ThisInConstructorOverloading("Sumon");
        ThisInConstructorOverloading c3 = new ThisInConstructorOverloading();

        System.out.println(c1);         // When we print out the object, it actually print out the toString
        System.out.println(c2);         // When we print out the object, it actually print out the toString
        System.out.println(c3);         // When we print out the object, it actually print out the toString
    }

}
