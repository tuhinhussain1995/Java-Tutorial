package InstanceVsStatic;

public class Donation {
    private static final String organization_name = "Motivation Group";
    private static int total_donation = 0;

    private String name;
    private String address;
    private int donation;

    public Donation(String name, String address, int donation){
        this.name = name;
        this.address = address;

        if(donation > 0){
            this.donation = donation;
            this.total_donation += donation;
        }
        else{
            this.donation = 0;
        }
    }


    public static String getOrganization_name() {
        return organization_name;
    }


    public static int getTotal_donation() {
        return total_donation;
    }

    public static void setTotal_donation(int total_donation) {
        Donation.total_donation = total_donation;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    public int getDonation() {
        return donation;
    }

    public void setDonation(int donation) {
        if(donation > 0){
            this.donation = this.donation + donation;
            this.total_donation += donation;
        }
        else{
            this.donation = 0;
        }

    }

    public void display(){
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Donate: RM " + donation + "\n");
    }
}
