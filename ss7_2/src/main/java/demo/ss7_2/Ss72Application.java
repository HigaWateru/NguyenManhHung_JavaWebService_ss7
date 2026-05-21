package demo.ss7_2;

import demo.ss7_2.service.ProductService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@EnableAspectJAutoProxy
@SpringBootApplication
public class Ss72Application {
    public static void main(String[] args) {
        SpringApplication.run(Ss72Application.class, args);
    }
    @Bean
    public CommandLineRunner commandLineRunner(ProductService productService) {
        return args -> {
            try {
                productService.add();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        };
    }
}
