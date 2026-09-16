package abstractfactory;

public class OrionController implements Controller {

    @Override
    public void control() {
        System.out.println("Orion Controller: managing Orion devices.");
    }
}