package cn.luotuoyulang;

import cn.luotuoyulang.entitys.MyBeanPostProcessor;
import cn.luotuoyulang.entitys.PersonEntity;
import org.junit.Test;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.mock.web.MockMultipartFile;

import java.io.IOException;
import java.io.InputStream;

@Configuration
public class PersonTest {

    @Test
    public void initPerson() throws Exception {

        ClassPathResource classPathResource = new ClassPathResource("application-context.xml");
        XmlBeanFactory xmlBeanFactory = new XmlBeanFactory(classPathResource);
        PersonEntity person = (PersonEntity) xmlBeanFactory.getBean("personEntity");
        System.out.println(person);
    }

    @Test
    public void person() throws Exception {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application-context.xml");
        PersonEntity person = (PersonEntity) applicationContext.getBean("personEntity");
        System.out.println(person);
    }

    @Test
    public void lifeOne() throws Exception {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application-context.xml");
        PersonEntity person = (PersonEntity) applicationContext.getBean("person");
        System.out.println(person);

        System.out.println("现在开始关闭容器！");
                 ((ClassPathXmlApplicationContext)applicationContext).registerShutdownHook();

    }

    @Test
    public void lifeTwo() throws Exception {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application-context.xml");
        MyBeanPostProcessor person = (MyBeanPostProcessor) applicationContext.getBean("beanPostProcessor");
        System.out.println(person);

        System.out.println("现在开始关闭容器！");
                 ((ClassPathXmlApplicationContext)applicationContext).registerShutdownHook();

    }
}
