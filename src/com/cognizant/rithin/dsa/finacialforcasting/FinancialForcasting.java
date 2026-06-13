package com.cognizant.rithin.dsa.finacialforcasting;

public class FinancialForcasting {
    public static double calculate(double amount, int year, float rate) {
        if(year == 0) {
            return amount;
        }
        return calculate(amount , year - 1,rate) * (1 + (rate/100));
    }
}
