package cn.luotuoyulang.condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class MyConditional implements Condition {
    /**
     *
     * @param conditionContext 获取上下文对象
     * @param annotatedTypeMetadata 获取当前注解的信息
     * @return
     */
    @Override
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        Environment environment = conditionContext.getEnvironment();
        String osName = environment.getProperty("os.name");
        System.out.println("osName = " + osName);
        if (osName.equals("Windows 10")) {
            System.out.println("允许注入");
            return true;
        }
        System.out.println("不允许注入");
        return false;
    }
}
