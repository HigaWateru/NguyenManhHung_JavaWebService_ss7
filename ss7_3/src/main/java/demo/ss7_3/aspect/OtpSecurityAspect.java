package demo.ss7_3.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class OtpSecurityAspect {

    @Around("@annotation(demo.ss7_3.annotation.RequiresOTP)")
    public Object verifyOtp(ProceedingJoinPoint joinPoint) throws Throwable {
        Object[] args = joinPoint.getArgs();
        String otp = null;

        for (Object arg : args) if (arg instanceof String) otp = (String) arg;

        if (otp == null || otp.trim().isEmpty()) {
            throw new RuntimeException("OTP không được để trống");
        }

        // Giả lập OTP
        if (!"123456".equals(otp)) {
            throw new RuntimeException("OTP không hợp lệ");
        }
        return joinPoint.proceed();
    }
}