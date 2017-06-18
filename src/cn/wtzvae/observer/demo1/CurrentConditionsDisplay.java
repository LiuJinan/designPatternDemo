package cn.wtzvae.observer.demo1;

/**
 * Created by LiuJinan on 2017/6/17.
 */
public class CurrentConditionsDisplay {

    private float temperature;  //温度

    private float humidity;     //湿度

    private float pressure;     //气压

    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }

    public void display() {
        String msg = "当前状况{" +
                "温度=" + temperature +
                ", 湿度=" + humidity +
                ", 气压=" + pressure +
                '}';
        System.out.println(msg);
    }
}