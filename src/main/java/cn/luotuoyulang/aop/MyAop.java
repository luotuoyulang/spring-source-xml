package cn.luotuoyulang.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyAop {

    /**
     * 定义切入点，切入点为com.example.demo.aop.AopController中的所有函数
     *通过@Pointcut注解声明频繁使用的切点表达式
     */
    @Pointcut("execution(public * cn.luotuoyulang.aopservice..*(..)))")
    public void aspect(){

    }

    @Around(value = "aspect()")
    public Object doAroundAdvice(ProceedingJoinPoint proceedingJoinPoint){
        try {
            System.out.println(" 前置通知 ");
            Object obj = proceedingJoinPoint.proceed();
            System.out.println(" 后置通知 ");
            return obj;
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        return null;
    }
}
