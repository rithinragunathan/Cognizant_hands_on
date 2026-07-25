package com.cognizant.loan.entity;

public class Loan {
    String number;
    String type;
    double loan;
    double emi;
    short tenure;

    public Loan(String number, String type, double loan, double emi, byte tenure) {
        this.number = number;
        this.type = type;
        this.loan = loan;
        this.emi = emi;
        this.tenure = tenure;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getLoan() {
        return loan;
    }

    public void setLoan(double loan) {
        this.loan = loan;
    }

    public double getEmi() {
        return emi;
    }

    public void setEmi(double emi) {
        this.emi = emi;
    }

    public short getTenure() {
        return tenure;
    }

    public void setTenure(short tenure) {
        this.tenure = tenure;
    }
}
