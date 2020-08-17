
package composition3;

public class RamSlot {
    private String model;
    private int memory;
    
    public RamSlot(String model, int memory){
        this.model = model;
        this.memory = memory;
    }
    
    public void setModel(String model){
        this.model = model;
    }
    
    public String getModel(){
        return model;
    }
    
    public void setMemory(int memory){
        this.memory =memory;
    }
    
    public int getMemory(){
        return memory;
    }
}
