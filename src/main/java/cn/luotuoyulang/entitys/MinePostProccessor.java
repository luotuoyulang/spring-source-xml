package cn.luotuoyulang.entitys;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class MinePostProccessor implements ApplicationContextAware {
    // spring 底层为什么能够实现 ApplicationContextAware 接口 就能够拿到ApplicationContext 就是因为 BeanPostProccessor 后置处理器
    ApplicationContext applicationContext;
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        BeanPost beanPost = applicationContext.getBean("beanPost", BeanPost.class);
        System.out.println("beanPost = " + beanPost);
    }
}
