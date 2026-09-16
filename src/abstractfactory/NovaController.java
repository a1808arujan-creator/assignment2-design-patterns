package abstractfactory;

public class NovaController implements Controller {

    @Override
    public void control() {
        System.out.println("Nova Controller: controlling Nova devices.");
    }
}