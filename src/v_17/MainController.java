package v_17;

import v_17.presenter.CreditPresenter;
import v_17.presenter.CreditPresenterInterface;
import v_17.view.CreditViewInterface;

public class MainController {
    private CreditViewInterface creditView;
    public MainController(CreditViewInterface creditView){
        this.creditView = creditView;
    }
    public void process(){
        CreditPresenterInterface creditPresenter = new CreditPresenter(creditView);
        boolean is_ok = true;
        creditView.printHello();
        while (is_ok)
            is_ok = creditPresenter.chooseMenu();
        creditView.printGoodBye();
    }
}
