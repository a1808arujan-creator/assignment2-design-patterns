package abstractfactory;

public class OrionSensor implements Sensor {

    @Override
    public void detect() {
        System.out.println("Orion Sensor: detecting room activity.");
    }
}
