package v_17.enums;

import v_17.base.Credit;

//Коллекция, отвечающая за хранение всех кредитов
public enum Credits {
    CREDIT_1(new Credit(Banks.SBER.getBank(), 3, 60,
            30000, 5000000, 10.9)),
    CREDIT_2(new Credit(Banks.TINKOFF.getBank(), 12, 60,
            50000, 199999, 7.9)),
    CREDIT_3(new Credit(Banks.TINKOFF.getBank(), 12, 180,
            200000, 15000000, 7.9));

    private Credit credit;

    private Credits(Credit creditTerms) {
        this.credit = creditTerms;
    }

    public Credit getCredit() {
        return credit;
    }
}
