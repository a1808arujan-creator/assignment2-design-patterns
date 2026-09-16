package abstractfactory;

public class OrionFactory implements SmartHomeFactory {

    @Override
    public Sensor createSensor() {
        return new OrionSensor();
    }

    @Override
    public Controller createController() {
        return new OrionController();
    }

    @Override
    public MobileApp createMobileApp() {
        return new OrionApp();
    }
}