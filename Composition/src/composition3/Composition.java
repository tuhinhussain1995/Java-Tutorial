
package composition3;

public class Composition {

    public static void main(String[] args) {
        Resolution theResolution = new Resolution(1080, 1920);
        Monitor theMonitor = new Monitor(theResolution);
        
        Processor theProcessor = new Processor("Core i5 3.5GHz");
        RamSlot theRamSlot = new RamSlot("Kingston ddr4", 8);
        
        Case theCase = new Case("On");
        powerSupply thePowerSupply = new powerSupply(theCase);
        
        Motherboard theMotherboard = new Motherboard("Gigabyte", theProcessor, theRamSlot, thePowerSupply);
        
        
        Pc thePc = new Pc(thePowerSupply, theMonitor, theMotherboard);
        
        thePc.displayInfo();
        thePc.runProgram();
    }
    
}
