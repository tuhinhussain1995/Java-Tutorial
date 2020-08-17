package udemySection06;

// if we use this or super keyword, it exactly indicate the this or super class function or variable.
// if we don't use this or super keyword, it follows the overriding method.

public class Dog extends Animal {
    private int legs;
    private int tail;
    private int teeth;

    public Dog(){
        this("No Name", 3, 13, 4, 1, 24);
    }

    public Dog(String name, int height, int legs){
        this(name, height, 15, legs, 1, 24);
    }

    public Dog(String name, int height, int weight, int legs, int tail, int teeth){
        super(name, height, weight);
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
    }

        // here super.getName() and getName() are same. According to overriding method.

    private void chew(){
        System.out.println(super.getName() + " can chew");
    }


    @Override
    public void eat() {
        System.out.println(getName() + " Can eat");

        super.eat();                       // super indicating the super class function
        this.chew();    // or chew();                   // this indicating the this class function

    }

    public void walk(){
        System.out.println(super.getName() + " can move");

        move(5);
    }

    public void run(){
        System.out.println(getName() + " can run");

        move(10);
    }


    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public int getTail() {
        return tail;
    }

    public void setTail(int tail) {
        this.tail = tail;
    }

    public int getTeeth() {
        return teeth;
    }

    public void setTeeth(int teeth) {
        this.teeth = teeth;
    }
}