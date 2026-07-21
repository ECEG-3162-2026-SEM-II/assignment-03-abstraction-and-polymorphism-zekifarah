import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<SmartDevice> devices = new ArrayList<>();
        devices.add(new SmartLight("Living Room Light"));
        devices.add(new SmartThermostat("Hallway Thermostat"));

        for (SmartDevice device : devices) {
            device.activate();
        }
    }
}
