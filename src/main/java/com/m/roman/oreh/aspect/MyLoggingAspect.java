package com.m.roman.oreh.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
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

    @Around("execution(* com.roman.portier.service.serviceImp.*.*(..))")
    public Object aroundAllRepositoryMethodsAdvice(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        MethodSignature methodSignature = (MethodSignature) proceedingJoinPoint.getSignature();
        String methodName = methodSignature.getName();
        logger.info("Begin of " + methodName);
        Object targetMethodResult = proceedingJoinPoint.proceed();
        logger.info("End of " + methodName);
        return targetMethodResult;
    }
}
