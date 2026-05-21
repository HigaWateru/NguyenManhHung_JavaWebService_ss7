package org.bank.digital.transaction.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class TransactionAspect {

    @Around("execution(* org.bank.digital.transaction.service..*.*(..))")
    public Object processTimingMethod(ProceedingJoinPoint joinPoint) throws Throwable {
        String methodName = joinPoint.getSignature().getName();
        System.out.println(methodName);
        long startTime = System.currentTimeMillis();
        Object result = joinPoint.proceed();

        long duration = System.currentTimeMillis() - startTime;

        System.out.println("LOG: Method " + methodName + " executed in " + duration + " ms");

        return result;
    }
}
