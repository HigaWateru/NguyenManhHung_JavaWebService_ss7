package demo.ss7_3;

import demo.ss7_3.service.BankingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Ss73Application implements CommandLineRunner {

    @Autowired
    private BankingService bankingService;

    public static void main(String[] args) {
        SpringApplication.run(Ss73Application.class, args);
    }

    @Override
    public void run(String... args) {
        try {
            String result = bankingService.withdraw(1000, "123456");
            System.out.println(result);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            String result = bankingService.transfer("An", 500, "999999");
            System.out.println(result);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            String result = bankingService.withdraw(200, "");
            System.out.println(result);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            String result = bankingService.getBalance();
            System.out.println(result);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}