package cn.wtzvae.observer.demo2;

/**
 * Created by LiuJinan on 2017/6/18.
 */
public class Main {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        StatisticsDiplay statisticsDiplay = new StatisticsDiplay(weatherData);

        weatherData.setMeasurements(10, 20, 30);
    }
}
