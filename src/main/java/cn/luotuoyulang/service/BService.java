package cn.luotuoyulang.service;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * @Description TODO
 * @Classname BService
 * @Date 2020/6/18 17:50
 * @Author by liuyuhu
 * @Contact 17600520726@163.com 微信 aa249890950-5
 */
@Scope
@Service
public class BService implements BeanNameAware {

    public BService() {
        System.out.println("BService");
    }

    @Override
    public void setBeanName(String name) {

    }




//    @Autowired
//    private AService aService;
}
