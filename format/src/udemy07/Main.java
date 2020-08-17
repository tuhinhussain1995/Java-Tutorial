package udemy07;

public class Main {

    public static void main(String[] args) {
        String item1 = "Rice";
        String item2 = "Potato";
        String item3 = "Chocolate";
        String item4 = "Tea";
        String item5 = "Coffee";

        float price1 = 2.50f;
        float price2 = 2.75f;
        float price3 = 7.35f;
        float price4 = 11.50f;
        float price5 = 15.75f;

        int quantity1 = 5;
        int quantity2 = 2;
        int quantity3 = 3;
        int quantity4 = 2;
        int quantity5 = 1;

        float total_cost = (price1*quantity1) + (price2*quantity2) + (price3*quantity3) + (price4*quantity4) + (price5*quantity5);


        System.out.printf("%13s  %15s  %15s  %18s %n", "Item Name", "Price", "Quantity", "Subtotal Price");
        System.out.printf("%-20s  %8.2f  %10d %7c  %13.2f %n", item1, price1, quantity1, '=', (price1*quantity1));
        System.out.printf("%-20s  %8.2f  %10d %7c  %13.2f %n", item2, price2, quantity2, '=', (price2*quantity2));
        System.out.printf("%-20s  %8.2f  %10d %7c  %13.2f \n", item3, price3, quantity3, '=', (price3*quantity3));
        System.out.printf("%-20s  %8.2f  %10d %7c  %13.2f %n", item4, price4, quantity4, '=', (price4*quantity4));
        System.out.printf("%-20s  %8.2f  %10d %7c  %13.2f \n%n", item5, price5, quantity5, '=', (price5*quantity5));

        System.out.printf("%-15s %49.2f %n", "Total Price", total_cost);


    }
}
