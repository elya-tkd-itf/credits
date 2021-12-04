package v_17.base;

import v_17.base.Bank;

public class Credit {
    private Bank bank;
    private int fromMonth, toMonth;
    private int fromSum, toSum;
    private double rate;

    public Credit(Bank bank, int fromMonth, int toMonth, int fromSum, int toSum, double rate){
        this.bank = bank;
        this.fromMonth = fromMonth;
        this.fromSum = fromSum;
        this.toMonth = toMonth;
        this.toSum = toSum;
        this.rate = rate;
    }

    @Override
    public String toString(){
        return "Кредит из банка " + bank.getName() + " на сумму от " + fromSum + " до " + toSum + " на время от " +
                fromMonth + " месяцев до " + toMonth + " месяцев с процентной ставкой " + rate + "%";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Credit other = (Credit) obj;
        return bank.equals(other.bank) && fromMonth == other.fromMonth && toMonth == other.toMonth &&
                fromSum == other.fromSum && toSum == other.toSum && Math.abs(rate - other.rate) <= 0.000001;
    }

    public Bank getBank() {
        return bank;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }

    public int getFromMonth() {
        return fromMonth;
    }

    public void setFromMonth(int fromMonth) {
        this.fromMonth = fromMonth;
    }

    public int getToMonth() {
        return toMonth;
    }

    public void setToMonth(int toMonth) {
        this.toMonth = toMonth;
    }

    public int getFromSum() {
        return fromSum;
    }

    public void setFromSum(int fromSum) {
        this.fromSum = fromSum;
    }

    public int getToSum() {
        return toSum;
    }

    public void setToSum(int toSum) {
        this.toSum = toSum;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }
}
