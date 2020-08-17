package InterfaceExample;

public class Main {

    public static void main(String[] args) {
        Shape shape = new Circle(10);
        shape.draw();
        System.out.println("Area="+shape.getArea());



        shape = new Rectangle(10,10);
        System.out.println(shape);
        shape.draw();
        System.out.println("Area="+shape.getArea());
    }
}
