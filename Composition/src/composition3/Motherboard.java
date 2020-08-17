
package composition3;

public class Motherboard {
    private String model;
    private Processor processor;
    private RamSlot ramSlot;
    private powerSupply powSupply;
    
    public Motherboard(String model, Processor processor, RamSlot ramSlot, powerSupply powSupply){
        this.model = model;
        this.processor = processor;
        this.ramSlot = ramSlot;
        this.powSupply = powSupply;
        
    }
    
    public void motherboardInfo(){
        if(powSupply.getPowerSupplyToMotherboard() == "On"){
            System.out.println("Motherboard Model: " + model);
            System.out.println("Processor Info: " + processor.getModel());
            System.out.println("Ram Info: " + ramSlot.getModel() + " " + ramSlot.getMemory() + " GB");
        }
        else{
            System.out.println("Motherboard has no power supply");
        }
    }
    
    public void runProgram(){
        System.out.println("Program is loading....");
    }
    
    
    public void setProcessor(Processor processor){
        this.processor = processor;
    }
    public Processor getProcessor(){
        return processor;
    }
}
