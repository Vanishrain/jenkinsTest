package ie.cas.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.test.annotation.Commit;

@Aspect
@Component
public class SpringAop {

//    /** 以 controller 包下定义的所有请求为切入点 */
//    @Pointcut("execution(public * ie.cas.service..*.*(..))")
//    public void webLog() {}
//
//    @Before("webLog()")
//    public void before(JoinPoint joinPoint){
//        String fileName = joinPoint.getTarget().toString();
//        System.out.println(fileName);
//    }


}
