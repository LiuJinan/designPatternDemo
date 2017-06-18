package cn.wtzvae.observer.demo2;

/**
 * Created by LiuJinan on 2017/6/18.
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement{

    private float temperature;  //温度
    private float humidity;     //湿度
    private float pressure;     //气压

    private Subject weatherData;

    public CurrentConditionsDisplay(Subject subject) {
        this.weatherData = subject;
        this.weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        String msg = "布告栏：当前状况{" +
                "温度=" + temperature +
                ", 湿度=" + humidity +
                ", 气压=" + pressure +
                '}';
        System.out.println(msg);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }
}
