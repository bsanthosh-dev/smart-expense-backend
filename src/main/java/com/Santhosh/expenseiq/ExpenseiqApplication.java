package com.santhosh.expenseiq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.santhosh")
public class ExpenseiqApplication {

    public static void main(String[] args) {

        SpringApplication.run(ExpenseiqApplication.class, args);
    }
}
