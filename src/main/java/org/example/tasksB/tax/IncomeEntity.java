package org.example.tasksB.tax;


import java.util.Formatter;

abstract public class IncomeEntity {
    protected String sourceName;
    protected Integer amount;

    protected IncomeEntity(Integer amount, String sourceName) {
        this.amount = amount;
        this.sourceName = sourceName;
    }

    public Integer getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return new Formatter().format("%27s  | %8d  | ", sourceName, amount).toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof IncomeEntity)) return false;

        IncomeEntity that = (IncomeEntity) o;

        if (!amount.equals(that.amount)) return false;
        if (!sourceName.equals(that.sourceName)) return false;

        return true;
    }

}
