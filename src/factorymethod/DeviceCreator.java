package factorymethod;

public abstract class DeviceCreator {

    public abstract Device createDevice();

    public void testDevice() {
        Device device = createDevice();

        System.out.println("Preparing device...");
        device.operate();
        System.out.println("Device is ready.");
    }
}
