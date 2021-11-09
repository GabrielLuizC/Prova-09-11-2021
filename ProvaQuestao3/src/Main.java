import Controller.SistemaController;
import Model.Sistema;
import View.SistemaView;

public class Main {
    public static void main(String[] args) {
        SistemaController controller = new SistemaController();
        Sistema sistema = new Sistema();
        SistemaView view = new SistemaView();

        view.menu();
    }
}
