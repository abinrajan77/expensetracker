package com.sampleproject.expensetracker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExpenseController {

    @GetMapping("/expenses")
    private String getAllExpenses() {
        return "List of expenses";
    }
}
