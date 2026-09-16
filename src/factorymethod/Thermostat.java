package factorymethod;

public class Thermostat implements Device {

    @Override
    public void operate() {
        System.out.println("Thermostat: adjusting the room temperature.");
    }
}
