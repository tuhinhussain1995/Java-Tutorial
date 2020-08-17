package MultipleInterfaceExample;

public class Tiger implements Animal, Beast {
    private double speed;

    public Tiger(double speed){
        this.speed = speed;
    }

    @Override
    public void makeSound() {
        System.out.println("Woof");
    }

    @Override
    public double move() {
        return this.speed;
    }

    @Override
    public void canAttackOthers() {
        System.out.println("Tiger attacks other Animals");
    }


    public void display(){
        System.out.println("Tiger" + Animal.desc);
        System.out.println(Beast.desc);
    }
}
