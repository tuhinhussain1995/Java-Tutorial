package ThisBasic;

public class ThisWithAmbiguityVariableNames {

    String name;
    int age;

    ThisWithAmbiguityVariableNames(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString(){            // toString is return type method and must be public
        return "Name: " + this.name + " & Age: " + this.age;
    }

    public static void display(){
        ThisWithAmbiguityVariableNames obj = new ThisWithAmbiguityVariableNames("Tuhin", 24);
        System.out.println(obj);         // When we print out the object, it actually print out the toString
    }
}
