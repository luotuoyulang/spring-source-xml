package cn.luotuoyulang.config;

import cn.luotuoyulang.entitys.LifeEntity;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyLifgConfig {

    @Bean(initMethod = "initMethod" , destroyMethod = "destoryMethod")
    public LifeEntity lifeEntity () {
        return new LifeEntity();
    }
}
