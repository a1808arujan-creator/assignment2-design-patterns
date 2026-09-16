package factorymethod;

public class Lamp implements Device {
    @Override
    public void operate() {
        System.out.println("Lamp: turning the smart light on.");
    }
}
