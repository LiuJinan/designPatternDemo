package cn.wtzvae.observer.demo1;

/**
 * Created by LiuJinan on 2017/6/17.
 */
public class StatisticsDiplay {

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
        String msg = "气象统计{" +
                "平均温度=xx"  +
                ", 最高温度=xx"  +
                ", 最低温度=xx"  +
                '}';
        System.out.println(msg);
    }
}
