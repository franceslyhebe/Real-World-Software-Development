package com.exercise.app.Chapter2;

import java.time.LocalDate;
import java.util.Objects;

public class BankTransaction {
    private final LocalDate DATE;
    private final double AMOUNT;
    private final String DESCRIPTION;
    public BankTransaction(final LocalDate date, final double amount, final String description){
        this.DATE = date;
        this.AMOUNT = amount;
        this.DESCRIPTION = description;
    }

    public LocalDate getDATE() {
        return DATE;
    }

    public double getAMOUNT() {
        return AMOUNT;
    }

    public String getDESCRIPTION() {
        return DESCRIPTION;
    }

    @Override
    public String toString() {
        return "BankTransaction{" +
                "DATE=" + DATE +
                ", AMOUNT=" + AMOUNT +
                ", DESCRIPTION='" + DESCRIPTION + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BankTransaction that = (BankTransaction) o;
        return Double.compare(that.AMOUNT, AMOUNT) == 0 && Objects.equals(DATE, that.DATE) && Objects.equals(DESCRIPTION, that.DESCRIPTION);
    }

    @Override
    public int hashCode() {
        return Objects.hash(DATE, AMOUNT, DESCRIPTION);
    }
}
