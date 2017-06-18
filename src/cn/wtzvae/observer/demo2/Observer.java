package cn.wtzvae.observer.demo2;

/**
 * Created by LiuJinan on 2017/6/18.
 */
public interface Observer {

    //当气象信息变动，主题会把信息通过参数传递给观察者
    public void update(float temp, float humidity, float pressure);
}
