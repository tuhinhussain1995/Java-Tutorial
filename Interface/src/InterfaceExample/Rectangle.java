package InterfaceExample;

public class Rectangle implements Shape  {

    private double width;
    private double height;

    public Rectangle(double w, double h){
        this.width=w;
        this.height=h;
    }
    @Override
    public void draw() {
        System.out.println("Drawing Rectangle");
    }

    @Override
    public double getArea() {
        return this.height*this.width;
    }

    @Override
    public String toString(){
        return Shape.label;
    }
}
