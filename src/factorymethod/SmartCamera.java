package factorymethod;

public class SmartCamera implements Device {

    @Override
    public void operate() {
        System.out.println("Smart Camera: starting security monitoring.");
    }
}
