package cn.luotuoyulang;

import cn.luotuoyulang.aopservice.AopService;
import cn.luotuoyulang.config.*;
import org.springframework.aop.aspectj.annotation.AnnotationAwareAspectJAutoProxyCreator;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.lang.reflect.InvocationTargetException;

/**
 * @Description TODO
 * @Classname SpringSourceApplication
 * @Date 2020/6/18 17:52
 * @Author by liuyuhu
 * @Contact 17600520726@163.com 微信 aa249890950-5
 */
//@Lazy
//@EnableEntity
//@ComponentScan(value = {"cn.luotuoyulang.service","cn.luotuoyulang.config"})
public class SpringSourceApplication {

    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
//        AnnotationConfigApplicationContext applicationContext =
//                new AnnotationConfigApplicationContext(SpringSourceApplication.class);
//        applicationContext.getBean("personEntity", PersonEntity.class);
//        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
//        for (String beanDefinitionName : beanDefinitionNames) {
//            System.out.println(beanDefinitionName);
//        }
//        myFactory();
//        configurable();
//        lifeCycle();
//        beanPostProccessor ();
//        initBean();
        aop();
    }

    /**
     * factoryBean 注入对象
     */
    private static void myFactory() {
        AnnotationConfigApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(SpringSourceApplication.class);
        Object bean = applicationContext.getBean("cn.luotuoyulang.factory.MyFactoryBean");
        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println(beanDefinitionName);
        }
    }

    /**
     * configurable
     * 根据条件考虑是否注入bean对象
     */
    private static void configurable() {
        AnnotationConfigApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(MyConditionalConfiguration.class);
        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println(beanDefinitionName);
        }
    }

    public static void lifeCycle () {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(MyLifgConfig.class);
        annotationConfigApplicationContext.close();
    }

    public static void beanPostProccessor () {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(BeanPostProccessorConfig.class);
//        annotationConfigApplicationContext.getBean("beanPost");
        annotationConfigApplicationContext.close();
    }

    public static void initBean () {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(MyInitBeanConfig.class);
        String[] beanDefinitionNames = annotationConfigApplicationContext.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println("beanDefinitionName = " + beanDefinitionName);
        }
    }

    public static void aop () {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyAopConfig.class);
        AopService aopService = applicationContext.getBean("aopService", AopService.class);
        aopService.a();
        AnnotationAwareAspectJAutoProxyCreator annotationAwareAspectJAutoProxyCreator = (AnnotationAwareAspectJAutoProxyCreator)applicationContext.getBean("org.springframework.aop.config.internalAutoProxyCreator",AnnotationAwareAspectJAutoProxyCreator.class);
        System.out.println("annotationAwareAspectJAutoProxyCreator : " +annotationAwareAspectJAutoProxyCreator.toString());
    }
}
