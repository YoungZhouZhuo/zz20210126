package cn.com.taiji.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringApplication {
    public static void main(String[] args) {
//        ApplicationContext context = new ClassPathXmlApplicationContext("services.xml", "daos.xml");
//        for (String beanName : context.getBeanDefinitionNames()) {
//            System.out.println(beanName);
//        }

//        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("cn.com.taiji.spring");
//        CollectionUtils.arrayToList(context.getBeanDefinitionNames()).forEach(item-> System.out.println(item));

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(AppConfig.class);
        //context.addApplicationListener(new ApplicationStartedListner());
        context.refresh();
        //CollectionUtils.arrayToList(context.getBeanDefinitionNames()).forEach(item-> System.out.println(item));
        UserServiceImpl userServiceImpl = context.getBean(UserServiceImpl.class);
        UserServiceImpl userServiceImpl1 = context.getBean(UserServiceImpl.class);
        System.out.println(userServiceImpl);
        System.out.println(userServiceImpl1);

        userServiceImpl.save();
    }
}
