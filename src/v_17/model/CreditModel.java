package v_17.model;

import v_17.base.Credit;
import v_17.enums.Credits;

import java.util.ArrayList;
import java.util.List;

public class CreditModel implements CreditModelInterface{
    @Override
    public List<Credit> getCredits() {
        List<Credit> credits = new ArrayList<>();
        if (Credits.values() == null) throw new NullPointerException();
        for (Credits credit : Credits.values())
            credits.add(credit.getCredit());
        return credits;
    }
}
