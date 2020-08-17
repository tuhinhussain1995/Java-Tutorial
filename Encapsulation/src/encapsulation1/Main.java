package encapsulation1;

public class Main {

    public static void main(String[] args) {
        Printer tuhin = new Printer(true, false, 11);

        System.out.println("Total Page: " + tuhin.getNumber_of_page());
        System.out.println("Total Cost: " + tuhin.getTotal_cost());

    }
}
