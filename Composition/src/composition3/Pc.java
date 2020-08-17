
package composition3;

public class Pc {
    private powerSupply powSupply;
    private Monitor monitor;
    private Motherboard motherboard;
    
    public Pc(powerSupply powSupply, Monitor monitor, Motherboard motherboard){
        this.powSupply = powSupply;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }
    
    public void displayInfo(){
        powSupply.powerSupplyInfo();
        monitor.monitorInfo();
        motherboard.motherboardInfo();
    }
    
    public void runProgram(){
        motherboard.runProgram();
    }
}
