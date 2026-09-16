package abstractfactory;

public class SmartHomeClient {

    private final Sensor sensor;
    private final Controller controller;
    private final MobileApp mobileApp;

    public SmartHomeClient(SmartHomeFactory factory) {
        this.sensor = factory.createSensor();
        this.controller = factory.createController();
        this.mobileApp = factory.createMobileApp();
    }

    public void startSystem() {
        System.out.println("Starting smart-home system...");

        sensor.detect();
        controller.control();
        mobileApp.connect();

        System.out.println("Smart-home system is ready.");
    }
}