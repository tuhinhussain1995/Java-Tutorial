package MultipleInterfaceExample;

public class Cat implements Animal, Pet {
    private double speed;

    public Cat(double speed){
        this.speed = speed;
    }

    @Override
    public void makeSound() {
        System.out.println("Mew");
    }

    @Override
    public double move() {
        return this.speed;
    }

    @Override
    public void canPlayWithHuman() {
        System.out.println("Cat can play with human");
    }


    public void display(){
        System.out.println("Cat" + Animal.desc);
        System.out.println(Pet.desc);
    }
}
