package v_17.enums;

import v_17.base.Bank;

public enum Banks {
    SBER(new Bank("Сбербанк")),
    TINKOFF(new Bank("Тинькофф"));

    private Bank bank;
    Banks(Bank bank) {
        this.bank = bank;
    }
    public Bank getBank() {
        return bank;
    }
}
