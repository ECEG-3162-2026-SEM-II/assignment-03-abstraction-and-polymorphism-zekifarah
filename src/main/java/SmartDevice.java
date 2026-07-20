

public abstract class SmartDevice {
    
    
    private String name;

    
    public SmartDevice(String name) {
        this.name = name;
    }

    
    public String getName() {
        return name;
    }

    
    public abstract void activate();
}