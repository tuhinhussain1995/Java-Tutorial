package SuperBasic;

public class Example1 {

    public static void display(){
        Dog d1 = new Dog();
        d1.makeSound();
        System.out.println(d1.height(3));
        d1.eat();
        d1.setName("Buck");
        d1.setAge(5);
        System.out.println(d1);                


        Cat c1 = new Cat("Tom", 3);
        c1.makeSound();
        System.out.println(c1.height(1));
        c1.eat();
        System.out.println(c1);

    }
}

////////////////////////////////////////////////////////////////////////////////////

abstract class Animal {             // or public/protected abstract class Animal {}
    private String name;
    private int age;
    public static final int head=1;

    public Animal(){
        System.out.println("Animal is called");
    }

    protected Animal(String name, int age){
        this.name = name;
        this.age = age;
    }


    abstract void makeSound();              // or public/protected abstract void makeSound();
    abstract String height(int a);          // or public/protected abstract String height(int a);


    public void eat(){
        System.out.println("Can Eat");
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    @Override
    public String toString(){
        return "Name="+this.name+"::Age="+this.age;
    }
}


class Dog extends Animal {
    public void makeSound() {
        System.out.println("WOOF");
    }

    public String height(int c){
        return "My height is: " + c + " Feet";
    }
}


class Cat extends Animal {
    protected Cat(){
        super("No name", 0);
    }

    public Cat(String name, int age){
        super(name, age);
    }

    public void makeSound() {
        System.out.println("Meows ");
    }

    public String height(int c){
        return "My height is: " + c + " Feet";
    }

    @Override
    public void eat(){
        System.out.println("I eat milk");
    }
}
