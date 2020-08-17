
package composition3;

public class Case {
    private String powerSwitch;
    private String model = "Dell case v3.2";
    private String powerSupply;
    
    public Case(String powerSwitch){
        this.powerSwitch = powerSwitch;
        
        if(this.powerSwitch == "On"){
            this.powerSupply = "On";
        }
    }
    
    public void setPowerSupply(String powerSupply){
        this.powerSupply = powerSupply;
    }
    
    public String getPowerSupply(){
        return powerSupply;
    }
    
    public void setModel(String model){
        this.model = model;
    }
    
    public String getModel(){
        return model;
    }
    
    public void setPowerSwitch(String powerSwitch){
        this.powerSwitch = powerSwitch;
    }
    
    public String getPowerSwitch(){
        return powerSwitch;
    }
}
