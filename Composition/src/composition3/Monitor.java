
package composition3;

public class Monitor {
    private String model = "Samsung";
    private int size = 21;
    private Resolution resolution;
    
    public Monitor(Resolution resolution){
        this.model = model;
        this.size = size;
        this.resolution = resolution;
        
    }
    
    public void monitorInfo(){
        System.out.println("Monitor Model: " + model + " " + size + " inches");
        System.out.println("Resolution: " + resolution.getWidth() + "x" + resolution.getHeight());
    }
}
