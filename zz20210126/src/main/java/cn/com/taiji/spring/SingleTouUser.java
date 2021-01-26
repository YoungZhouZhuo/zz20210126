package cn.com.taiji.spring;

public class SingleTouUser {

    private  SingleTouUser() {

    }

    private static SingleTouUser singleTouUser;

    private static SingleTouUser getInstance() {

        if(singleTouUser == null) {
            singleTouUser = new SingleTouUser();
        } else {
            return singleTouUser;
        }
        return null;
    }
}
