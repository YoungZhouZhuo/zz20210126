package cn.com.taiji.spring;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class SchedueTask implements InitializingBean {

    //某个bean执行后附加操作
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("schheueTask init finish");
    }
}
