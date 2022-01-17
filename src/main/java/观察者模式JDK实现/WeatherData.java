package 观察者模式JDK实现;

import java.util.Observable;

/**
 * @author a1073
 */
public class WeatherData extends Observable {
    private float temperature;
    private float humidity;
    private float pressure;
    public WeatherData(){};

    /**
     * 天气预报系统会去调用这个方法
     *
     */
    public void measurementsChanged(){
        setChanged();
        notifyObservers();
    }
    public float getTemperature() {
        return temperature;
    }

    public void setMeasurements(float temperature,float humidity,float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
    public float getHumidity() {
        return humidity;
    }


    public float getPressure() {
        return pressure;
    }


}
