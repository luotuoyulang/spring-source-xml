package cn.luotuoyulang.config;

import cn.luotuoyulang.entitys.InitBean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Import(InitBean.class)
@Configuration
public class MyInitBeanConfig {
}
