package cn.com.taiji.spring;

import org.junit.Test;

public class ProxyUserServiceTest {

    @Test
    public void testProxyUserService() {
        ProxyUserService proxyUserService = new ProxyUserService(new UserServiceImpl());
        proxyUserService.save();
    }

    @Test
    public void testProxyUserServiceJdk() {
        ProxyUserServiceJdk proxyUserServiceJdk = new ProxyUserServiceJdk(new UserServiceImpl());
        UserService userService = (UserService) proxyUserServiceJdk.getTarget();
        userService.update();
    }
}
