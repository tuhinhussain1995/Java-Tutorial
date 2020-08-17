package udemySection06;

// Person sally = new Person();

// Person => name of class
// sally => object name
// new => allocate memory
// Person() => constructor

public class Main {

    public static void main(String[] args) {
// For SimpleCalculator

        SimpleCalculator obj1 = new SimpleCalculator();
        obj1.display();
// For car class

        Car porsche = new Car(4, "Carrera", "red");
        porsche.display();

// For Account

	    Account tuhin = new Account(11111, 3000.00, "Tuhin Hossain");
	    tuhin.withdraw(1000);
        tuhin.withdraw(500);
        tuhin.deposit(300);
        tuhin.setBalance(10_000);
        System.out.println("Balance: " + tuhin.getBalance());

        Account nazrul = new Account(22222, "Nazrul Islam");
    }
}
