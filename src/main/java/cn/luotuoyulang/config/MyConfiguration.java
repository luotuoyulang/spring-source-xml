package cn.luotuoyulang.config;

import cn.luotuoyulang.entitys.PersonEntity;
import cn.luotuoyulang.entitys.Zi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * @Description TODO
 * @Classname MyConfiguration
 * @Date 2020/7/23 10:32
 * @Author by liuyuhu
 * @Contact 17600520726@163.com 微信 aa249890950-5
 */
@Configuration
public class MyConfiguration {

    @Bean
    public PersonEntity personEntity(){
        return new PersonEntity();
    }

    @Bean
    public Zi a(){
        return new Zi();
    }
}
