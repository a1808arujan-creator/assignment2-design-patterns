package abstractfactory;

public class NovaSensor implements Sensor {

    @Override
    public void detect() {
        System.out.println("Nova Sensor: detecting motion.");
    }
}
