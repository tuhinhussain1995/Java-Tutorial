package udemySection06;

public class Car {
    private int doors;
    private String model;
    private String color;

    public Car(int doors, String model, String color){
        this.doors = doors;
        this.model = model;
        this.color = color;
    }

    public void setModel(String model){
        String validModel = model.toLowerCase();
        if(validModel.equals("carrera") || validModel.equals("commodore")){
            this.model = model;
        }
        else{
            this.model = "Unknown";
        }
    }

    public int getDoors(){
        return this.doors;
    }
    public String getModel(){
        return this.model;
    }
    public String getColor(){
        return this.color;
    }

    public void display(){

        System.out.println(getModel() + " ==> " + getColor() +
                " ==> " + getDoors());

        setModel("911");
        System.out.println(getModel() + " ==> " + getColor() +
                " ==> " + getDoors());
    }
}

