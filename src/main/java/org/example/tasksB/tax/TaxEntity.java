package org.example.tasksB.tax;

import java.util.Formatter;

public class TaxEntity implements Comparable<TaxEntity>{
    protected IncomeEntity income;
    protected Double rate;
    protected Double tax;

    protected TaxEntity(IncomeEntity income, Double rate) {
        this.income = income;
        this.rate = rate;
        this.tax = income.amount * rate;
    }

    @Override
    public int compareTo(TaxEntity o){
        double result = o.income.getAmount() * o.rate - this.income.getAmount() * this.rate;
        if (result < 0) return -1;
        else if (result > 0) return 1;
        else return -1;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TaxEntity)) return false;

        TaxEntity taxEntity = (TaxEntity) o;

        if (!income.equals(taxEntity.income)) return false;
        if (!rate.equals(taxEntity.rate)) return false;
        if (!tax.equals(taxEntity.tax)) return false;

        return true;
    }

    @Override
    public String toString() {
        return income.toString() + new Formatter().format("%5.2f  | %10.2f",
                rate, tax).toString();
    }
}