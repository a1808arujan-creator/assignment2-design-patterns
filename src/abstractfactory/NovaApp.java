package abstractfactory;

public class NovaApp implements MobileApp {

    @Override
    public void connect() {
        System.out.println("Nova App: connected to the Nova smart-home system.");
    }
}