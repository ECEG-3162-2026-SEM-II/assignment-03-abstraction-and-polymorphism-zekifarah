
// Top-level entry point for the assignment (no package)
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<SmartDevice> devices = new ArrayList<>();
        devices.add(new SmartLight("Living Room Light"));
        devices.add(new SmartThermostat("Main Thermostat"));

        for (SmartDevice device : devices) {
            device.activate();
        }
    }
}