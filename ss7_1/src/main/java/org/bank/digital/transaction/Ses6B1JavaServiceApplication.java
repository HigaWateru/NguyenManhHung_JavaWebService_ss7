package org.bank.digital.transaction;

import org.bank.digital.transaction.service.TransactionService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@EnableAspectJAutoProxy
@SpringBootApplication
public class Ses6B1JavaServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(Ses6B1JavaServiceApplication.class, args);
    }

    @Bean
    public CommandLineRunner runner(TransactionService transactionService) {
        return args -> transactionService.processPayment("ACC-001", 250_000);
    }
}
