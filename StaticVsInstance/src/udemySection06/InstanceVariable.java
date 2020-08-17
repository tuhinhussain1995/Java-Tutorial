package udemySection06;

public class InstanceVariable {
    private String name;

    public InstanceVariable(String name){
        this.name = name;
    }

    public void printName(){
        System.out.println("Dog name: " + name);
    }

    public int age = 30;
}
