package com.m.roman.oreh.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;


@Component
@Aspect
public class MyLoggingAspect {

    private static final Logger logger = LoggerFactory.getLogger(MyLoggingAspect.class);

    @AfterReturning("execution(* com.m.roman.oreh.service.serviceImp.*.*(..))")
    public void afterRepositoryMethodsAdvice(JoinPoint joinPoint) {
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        String methodName = methodSignature.getName();

        Class<?> targetClass = joinPoint.getTarget().getClass();
        String serviceName = targetClass.getSimpleName();

        logger.info(serviceName + "." + methodName + " was used");
    }
}
