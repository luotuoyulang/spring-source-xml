package cn.luotuoyulang.config;

import cn.luotuoyulang.entitys.BeanPost;
import cn.luotuoyulang.entitys.LifeEntity;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(LifeEntity.class)
public class BeanPostProccessorConfig  {

    @Bean
    public BeanPost beanPost () {
        return new BeanPost();
    }
}
