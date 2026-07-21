package com.jju;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        // 1. SmartDevice መያዝ የሚችል ArrayList መፍጠር
        ArrayList<SmartDevice> devices = new ArrayList<>();

        // 2. የLight እና Thermostat object-ዎችን ወደ list-ቱ መጨመር
        devices.add(new SmartLight("Living Room Light"));
        devices.add(new SmartThermostat("Main Thermostat"));

        // 3. በነጠላ for-each loop ሁሉንም መጥራት (Polymorphism)
        for (SmartDevice device : devices) {
            device.activate();
        }
    }
}