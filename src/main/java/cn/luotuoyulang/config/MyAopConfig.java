package cn.luotuoyulang.config;

import org.springframework.context.annotation.*;

@ComponentScan({"cn.luotuoyulang.aop","cn.luotuoyulang.aopservice"})
@Configuration
//@Component
@EnableAspectJAutoProxy
public class MyAopConfig {
}
