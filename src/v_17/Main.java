package v_17;

import v_17.view.CreditView;
import v_17.view.CreditViewInterface;

public class Main {

    public static void main(String[] args) {
        MainController mainController = new MainController(new CreditView());
        mainController.process();
    }
}
