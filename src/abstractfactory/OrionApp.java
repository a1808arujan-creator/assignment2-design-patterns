package abstractfactory;

public class OrionApp implements MobileApp {

    @Override
    public void connect() {
        System.out.println("Orion App: connected to the Orion smart-home system.");
    }
}