package demo.ss7_4.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AuditLoggingAspect {

    @AfterThrowing(pointcut = "execution(* com.example.elearning.service..*(..))", throwing = "ex")
    public void logException(JoinPoint joinPoint, Exception ex) {
        String methodName = joinPoint.getSignature().getName();
        System.out.println("[ERROR] Method " + methodName + " failed: " + ex.getClass().getSimpleName() + " - "
                + ex.getMessage());
    }
}