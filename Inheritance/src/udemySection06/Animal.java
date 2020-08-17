package udemySection06;

public class Animal {
    private String name;
    private int height;
    private int weight;

    public Animal(String name, int height, int weight){
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    public void eat(){
        System.out.println("Animal.eat() is called");
    }

    public void move(int speed){
        System.out.println("Animal.move() is called. Moving speed: " + speed);
    }

    public void fly(){
        System.out.println("Animal.fly() is called");
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setHeight(int height){
        this.height = height;
    }
    public void setWeight(int weight){
        this.weight = weight;
    }

    public String getName(){
        return this.name;
    }
    public int getHeight(){
        return this.height;
    }
    public int getWeight(){
        return this.weight;
    }
}
