package 观察者模式.impl;

import 观察者模式.DisplayElement;
import 观察者模式.Observer;
import 观察者模式.Subject;


public class CurrentConditionDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private Subject weatherData;

    /**
     * 主要关注这里，这里作为观察者被主题所插入
     * @param weatherData
     */
    public CurrentConditionDisplay(Subject weatherData){
        weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

    @Override
    public void display() {
        System.out.println(temperature + "---" + humidity + " ---");
    }
}
