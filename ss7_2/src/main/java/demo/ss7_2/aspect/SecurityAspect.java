package demo.ss7_2.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class SecurityAspect {
    private String currentUserRole = "VIP"; //Giả lập
    @Before("execution(* demo.ss7_2.service.ProductService.add(..))")
    public void verifyUser(JoinPoint joinPoint) {
        if(!"ADMIN".equals(currentUserRole)) {
            System.out.println("!! Truy cập bị từ chối !! User không có quyền !!");
            throw new RuntimeException("RuntimException: Chỉ ADMIN mới được thêm dữ liệu");
        }
    }
}
