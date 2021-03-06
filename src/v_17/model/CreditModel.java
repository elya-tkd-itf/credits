package v_17.model;

import v_17.base.Credit;
import v_17.enums.Credits;

import java.util.ArrayList;
import java.util.List;
//Класс, отвечающий за получение данных
public class CreditModel implements CreditModelInterface{
    /**
     * Метод, возвращающий все доступные кредиты
     * @return
     */
    @Override
    public List<Credit> getCredits() {
        List<Credit> credits = new ArrayList<>();
        for (Credits credit : Credits.values())
            credits.add(credit.getCredit());
        return credits;
    }
}
