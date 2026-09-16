package abstractfactory;

public class NovaFactory implements SmartHomeFactory {

    @Override
    public Sensor createSensor() {
        return new NovaSensor();
    }

    @Override
    public Controller createController() {
        return new NovaController();
    }

    @Override
    public MobileApp createMobileApp() {
        return new NovaApp();
    }
}