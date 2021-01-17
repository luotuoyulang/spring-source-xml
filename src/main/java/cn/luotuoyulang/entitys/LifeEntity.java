package cn.luotuoyulang.entitys;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;

public class LifeEntity implements BeanNameAware, BeanFactoryAware , InitializingBean , DisposableBean {

    public LifeEntity() {
        System.out.println("1、构造方法执行");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("2、BeanNameAware 对象beanName: " + name);
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("3、BeanFactoryAware beanFactory ");
    }

    /**
     * InitializingBean 在给属性赋值之后执行
     * @throws Exception
     */
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("5、InitializingBean  属性赋值之后执行");
    }

//    private void destoryMethod() {
//        System.out.println(" destroyMethod bean 上定义");
//    }

    /**
     * bean 销毁的时候执行
     * @throws Exception
     */
    @Override
    public void destroy() throws Exception {
        System.out.println("7、 DisposableBean destroy bean 销毁的时候执行");
    }
}
