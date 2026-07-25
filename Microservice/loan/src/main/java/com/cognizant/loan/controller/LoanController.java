package com.cognizant.loan.controller;

import com.cognizant.loan.entity.Loan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoanController {
    @GetMapping("/loans/{number}")
    public Loan loanDetails(@PathVariable String number) {
        return new Loan(number,"car",4579d,778d, (byte) 5);
    }
}
