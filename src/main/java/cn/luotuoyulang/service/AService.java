package cn.luotuoyulang.service;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Description TODO
 * @Classname AService
 * @Date 2020/6/18 17:50
 * @Author by liuyuhu
 * @Contact 17600520726@163.com 微信 aa249890950-5
 */
@Service
public class AService  {

    @Autowired
    private BService bService;

    public AService() {
        System.out.println("AService");
    }

    public void setBeanName(String name) {

    }
}
