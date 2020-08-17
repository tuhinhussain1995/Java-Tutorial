package InstanceVsStatic;

public class Main {
    public static void main(String[] args){
        System.out.println("\t\t\t### Organization name: " + Donation.getOrganization_name() + " ###");

        Donation tuhin = new Donation("tuhin", "Desa petaling", 100);
        tuhin.setDonation(100);

        Donation sumon = new Donation("sumon", "Kuala Lumpur", 500);
        sumon.setDonation(100);

        tuhin.setDonation(50);
        tuhin.setDonation(10);
        sumon.setDonation(50);

        tuhin.display();
        sumon.display();

        System.out.println("\nTotal Donation: " + Donation.getTotal_donation());
    }
}
