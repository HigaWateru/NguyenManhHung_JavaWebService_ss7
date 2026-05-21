package demo.ss7_2;

import demo.ss7_2.service.ProductService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertThrows;

@SpringBootTest
public class SecurityAspectTest {

    @Autowired
    private ProductService productService;

    @Test
    public void testAddProduct_NonAdmin_ThrowsException() {
        // Vì trong SecurityAspect currentUserRole đang là "VIP" (không phải "ADMIN")
        // Nên khi gọi hàm add() sẽ phải ném ra RuntimeException
        assertThrows(RuntimeException.class, () -> {
            productService.add();
        });
    }
}
