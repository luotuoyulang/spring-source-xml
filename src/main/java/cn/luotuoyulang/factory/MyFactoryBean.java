package cn.luotuoyulang.factory;

import org.springframework.beans.factory.FactoryBean;

/**
 * 向 spring ioc 注入对象
 */
public class MyFactoryBean implements FactoryBean<FactoryBeanTest> {

    @Override
    public FactoryBeanTest getObject() throws Exception {
        return new FactoryBeanTest();
    }

    @Override
    public Class<?> getObjectType() {
        return FactoryBeanTest.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }
}
