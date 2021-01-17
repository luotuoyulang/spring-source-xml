package cn.luotuoyulang.entitys;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class BeanPost implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("4、BeanPostProcessor postProcessBeforeInitialization");
        return null;
    }

//    private void initMethod() {
//        System.out.println("6、initMethod() bean 上定义");
//    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("6、BeanPostProcessor postProcessAfterInitialization");
        return null;
    }
}
