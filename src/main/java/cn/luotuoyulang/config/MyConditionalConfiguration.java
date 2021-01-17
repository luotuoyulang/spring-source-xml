package cn.luotuoyulang.config;

import cn.luotuoyulang.defination.MyImportBeanDefinitionRegistrar;
import cn.luotuoyulang.entitys.Win7Entity;
import cn.luotuoyulang.factory.MyFactoryBean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @Import 功能效果上等同于 @Bean
 * 但是 @Bean id 为方法名
 * @Import id 为 cn.luotuoyulang.entitys.Win7Entity
 */
@Configuration
@Import({Win7Entity.class, MyImportBeanDefinitionRegistrar.class, MyFactoryBean.class})
public class MyConditionalConfiguration {

//    @Conditional(MyConditional.class)
//    @Bean
//    public Win7Entity win7Entity () {
//        return new Win7Entity();
//    }
}
