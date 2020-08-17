
package composition3;

public class powerSupply {
    private String model = "Dell powerSupply v4.3";
    private int watt = 450;
    private Case pcCase;
    private String powerSupplyToMotherboard;
    
    public powerSupply(Case pcCase){
        this.pcCase = pcCase;
        
        if(pcCase.getPowerSupply() == "On"){
            this.powerSupplyToMotherboard = "On";
            
        }
    }
    
    public void powerSupplyInfo(){
        if(pcCase.getPowerSupply() == "On"){
            System.out.println("Power Supply is on");
            System.out.println("Power Supply Model: " + model + "\nWatt: " + watt);
        }
        else{
            System.out.println("Power Supply is off");
        }
    }
    
    public void setModel(String model){
        this.model = model;
    }
    
    public void setWatt(int watt){
        this.watt = watt;
    }
    
    public String getPowerSupplyToMotherboard(){
        return powerSupplyToMotherboard;
    }
    
    
}
