package v_17.presenter;

import v_17.base.Credit;
import v_17.model.CreditModel;
import v_17.model.CreditModelInterface;
import v_17.view.CreditView;
import v_17.view.CreditViewInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CreditPresenter implements CreditPresenterInterface {
    private CreditViewInterface creditView;
    private CreditModelInterface creditModel;
    private List<Credit> credits;

    public CreditPresenter(CreditViewInterface creditView){
        this.creditView = creditView;
        this.creditModel = new CreditModel();
        this.credits = creditModel.getCredits();
    }

    @Override
    public boolean chooseMenu() {
        creditView.printMenu();
        Scanner scanner = new Scanner(System.in);
        switch (scanner.nextInt()){
            case 1: creditView.printCredits(credits); break;
            case 2: changeMaxRate(); break;
            case 3: changeSum(); break;
            case 4: changeMonth(); break;
            case 5: credits = creditModel.getCredits(); break;
            case 6: return false;
            default: creditView.printErrorMenu(); break;
        }
        return true;
    }

    private void changeMonth(){
        Scanner scanner = new Scanner(System.in);
        creditView.printTypeMonth();
        int month = scanner.nextInt();
        while (month <= 0){
            creditView.printErrorMonth();
            month = scanner.nextInt();
        }
        List<Credit> filterCredit = new ArrayList<>();
        for (Credit credit : credits)
            if (credit.getFromMonth() <= month && month <= credit.getToMonth())
                filterCredit.add(credit);
        credits = filterCredit;
    }

    private void changeSum(){
        Scanner scanner = new Scanner(System.in);
        creditView.printTypeSum();
        int sum = scanner.nextInt();
        while (sum <= 0){
            creditView.printErrorSum();
            sum = scanner.nextInt();
        }
        List<Credit> filterCredit = new ArrayList<>();
        for (Credit credit : credits)
            if (credit.getFromSum() <= sum && sum <= credit.getToSum())
                filterCredit.add(credit);
        credits = filterCredit;
    }

    private void changeMaxRate(){
        Scanner scanner = new Scanner(System.in);
        creditView.printTypeRate();
        double maxRate = scanner.nextDouble();
        while (!(maxRate > 0 && maxRate < 100)){
            creditView.printErrorRate();
            maxRate = scanner.nextDouble();
        }
        List<Credit> filterCredit = new ArrayList<>();
        for (Credit credit : credits)
            if (credit.getRate() <= maxRate)
                filterCredit.add(credit);
        credits = filterCredit;
    }
}
