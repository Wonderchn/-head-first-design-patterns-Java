package 观察者模式.Test;

import 观察者模式.impl.CurrentConditionDisplay;
import 观察者模式.impl.WeatherData;

/**
 * 观察者模式实现
 */
public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);
        weatherData.setMeasurements(80, 65, 4);
    }

}
