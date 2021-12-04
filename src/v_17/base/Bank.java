package v_17.base;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Bank {
    private String name;
    private List<Credit> credits;

    public Bank(String name, List<Credit> credits){
        this.credits = credits;
        this.name = name;
    }
    public Bank(String name){
        this.name = name;
        this.credits = new ArrayList<>();
    }
    @Override
    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Банк ").append(name).append(" с кредитами:\n");
        for (Credit credit : credits)
            stringBuilder.append("\t").append(credit).append("\n");
        return stringBuilder.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Bank other = (Bank) obj;
        return name.equals(other.name) && credits.equals(other.credits);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Credit> getCredits() {
        return credits;
    }

    public void addCredits(Credit... credits){
        this.credits.addAll(Arrays.asList(credits));
    }

    public void setCredits(List<Credit> credits) {
        this.credits = credits;
    }
}
