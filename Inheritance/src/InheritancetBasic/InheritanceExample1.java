package InheritancetBasic;

public class InheritanceExample1 {
    public static void display(){
        Dog dog1 = new Dog();
        dog1.eat();
        dog1.sleep();
        dog1.bark();

        dog1.type = "mammal";            // Here type is protected(Animal) but how can we use it from InheritanceExample1, though it is not inheriting Animal?
                                         // Because Animal, Dog and InheritanceExample1 classes are in the same package.
                                         // Here type is using Dog object not InheritanceExample1.
        dog1.setColor("black");
        dog1.displayInfo(dog1.getColor());
    }
}

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

class Animal {                       // if we call a new class inside another class, the new class access modifiers must be default.

    protected String type;
    private String color;

    public void eat() {
        System.out.println("I can eat");
    }

    public void sleep() {
        System.out.println("I can sleep");
    }

    public String getColor(){
        return color;
    }

    public void setColor(String col){
        color = col;
    }
}


class Dog extends Animal {           // if we call a new class inside another class, the new class access modifiers must be default.
    public void displayInfo(String c){
        System.out.println("I am a " + type);
        System.out.println("My color is " + c);
    }
    public void bark() {
        System.out.println("I can bark");
    }
}
