package cn.com.taiji.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
@Scope("prototype") //多例
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

//    public void setUserDao(UserDao userDao) {
//        this.userDao = userDao;
//    }
//
//    public UserDao getUserDao() {
//        return userDao;
//    }

    public void save() {
//        Date start = new Date();
        System.out.println("service save");
//        Date end = new Date();
//        System.out.println(end.getTime() - start.getTime());
    }

    @Override
    public void update() {
        System.out.println("service update");
    }
}
