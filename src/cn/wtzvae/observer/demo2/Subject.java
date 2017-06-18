package cn.wtzvae.observer.demo2;

/**
 * Created by LiuJinan on 2017/6/18.
 */
public interface Subject {

    public void registerObserver(Observer observer);

    public void removeObserver(Observer observer);
    //主题变动，调用该方法通知所有观察者
    public void notifyObservers();
}
