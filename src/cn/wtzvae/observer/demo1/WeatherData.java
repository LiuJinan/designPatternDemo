package cn.wtzvae.observer.demo1;

/**
 * Created by LiuJinan on 2017/6/17.
 */
public class WeatherData {

    private float temperature;  //温度

    private float humidity;     //湿度

    private float pressure;     //气压

    private CurrentConditionsDisplay currentConditionsDisplay;

    private StatisticsDiplay statisticsDiplay;

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }

    /**
     * 气象信息变动后，自动调用该方法
     */
    public void measurementsChangeed() {
        float temp = getTemperature();
        float humidity = getHumidity();
        float pressure = getPressure();

        currentConditionsDisplay.update(temp, humidity, pressure);
        statisticsDiplay.update(temp, humidity, pressure);
    }
}
