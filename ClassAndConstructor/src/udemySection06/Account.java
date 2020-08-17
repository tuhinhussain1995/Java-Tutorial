package udemySection06;

public class Account {
    private int account_number;
    private double balance;
    private String customer_name;

    public Account(){
        this(0000, 0.00f, "No Name"); // calling other constructor inside default
    }

    public Account(int account_number, String customer_name){
        this(account_number, 0.00f, customer_name);
    }

    public Account(int account_number, double balance, String customer_name){
        this.account_number = account_number;
        this.balance = balance;
        this.customer_name = customer_name;

        System.out.println("Account Number: " + this.account_number);
        System.out.println("Customer Name: " + this.customer_name);
        System.out.println("Balance: " + this.balance);
    }



    public void setAccount_number(int account_number){
        this.account_number = account_number;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
    public void setCustomer_name(String customer_name){
        this.customer_name = customer_name;
    }

    public int getAccount_number(){
        return this.account_number;
    }
    public double getBalance(){
        return this.balance;
    }
    public String getCustomer_name(String customer_name){
        return this.customer_name;
    }


    public void deposit(double deposit_amount){
        this.balance += deposit_amount;
        System.out.println("New Deposit Amount: " + deposit_amount);
        System.out.println("Current Balance: " + this.balance);
    }

    public void withdraw(double withdraw_amount){
        if((this.balance - withdraw_amount) <= 0){
            System.out.println("Withdraw not possible.");
            System.out.println("Only " + this.balance + " is available");
        }
        else{
            this.balance -= withdraw_amount;

            System.out.println("Withdraw Amount: " + withdraw_amount);
            System.out.println("New Balance: " + this.balance);
        }
    }
}
