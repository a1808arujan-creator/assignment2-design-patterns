import factorymethod.CameraCreator;
import factorymethod.DeviceCreator;
import factorymethod.LampCreator;
import factorymethod.ThermostatCreator;

import abstractfactory.NovaFactory;
import abstractfactory.OrionFactory;
import abstractfactory.SmartHomeClient;
import abstractfactory.SmartHomeFactory;

public class Main {

    public static void main(String[] args) {

        System.out.println("===== PART A: FACTORY METHOD =====");

        DeviceCreator lampCreator = new LampCreator();
        lampCreator.testDevice();

        System.out.println();

        DeviceCreator thermostatCreator = new ThermostatCreator();
        thermostatCreator.testDevice();

        System.out.println();

        DeviceCreator cameraCreator = new CameraCreator();
        cameraCreator.testDevice();


        System.out.println();
        System.out.println("===== PART B: ABSTRACT FACTORY =====");

        String selectedVendor = "NOVA";

        SmartHomeFactory factory = selectFactory(selectedVendor);

        SmartHomeClient client = new SmartHomeClient(factory);

        client.startSystem();
    }

    private static SmartHomeFactory selectFactory(String vendor) {

        if (vendor.equalsIgnoreCase("NOVA")) {
            return new NovaFactory();
        }

        if (vendor.equalsIgnoreCase("ORION")) {
            return new OrionFactory();
        }

        throw new IllegalArgumentException(
                "Unknown smart-home vendor: " + vendor
        );
    }
}