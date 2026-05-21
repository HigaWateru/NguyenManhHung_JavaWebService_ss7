package org.bank.digital.transaction.service;

import org.springframework.stereotype.Service;

@Service
public class TransactionService {

    public boolean processPayment(String accountNumber, double amount) {
        System.out.println("SERVICE: Processing payment for account " + accountNumber + " with amount " + amount);

        try {
            Thread.sleep(150);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new IllegalStateException("Payment processing was interrupted", e);
        }

        return true;
    }
}
