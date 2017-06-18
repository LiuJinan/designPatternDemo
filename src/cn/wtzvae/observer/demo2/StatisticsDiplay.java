package cn.wtzvae.observer.demo2;

/**
 * Created by LiuJinan on 2017/6/18.
 */
public class StatisticsDiplay implements Observer , DisplayElement {

    private float temperature;  //温度
    private float humidity;     //湿度
    private float pressure;     //气压

    private Subject weatherData;

    public StatisticsDiplay(Subject subject) {
        this.weatherData = subject;
        this.weatherData.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }

    @Override
    public void display() {
        //具体计算省略
        String msg = "布告栏：气象统计{" +
                "平均温度=xx"  +
                ", 最高温度=xx"  +
                ", 最低温度=xx"  +
                '}';
        System.out.println(msg);
    }
}