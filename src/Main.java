import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<SmartDevice> devices = new ArrayList<>();
        devices.add(new SmartLight("Living Room Light"));
        devices.add(new SmartThermostat("Hallway Thermostat"));

        for (SmartDevice device : devices) {
            device.activate();
        }
    }
}
