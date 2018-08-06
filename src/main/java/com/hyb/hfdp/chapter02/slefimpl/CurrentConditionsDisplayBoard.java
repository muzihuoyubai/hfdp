package com.hyb.hfdp.chapter02.slefimpl;


/**
 * TODO
 *
 * @author HYB
 * @since 2018/8/7 0:22
 **/
public class CurrentConditionsDisplayBoard implements DisplayBoard, WeatherObserver {

    private float temperature;
    private float humidity;
    private float pressure;

    private WeatherSubject weatherSubject;

    public CurrentConditionsDisplayBoard(WeatherSubject weatherSubject) {
        this.weatherSubject = weatherSubject;
        weatherSubject.registerObserver(this);
    }

    public void unregister() {
        weatherSubject.removeObserver(this);
    }

    @Override
    public void display() {
        System.out.println(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }

    @Override
    public String toString() {
        return "CurrentConditionsDisplayBoard{" +
                "temperature=" + temperature +
                ", humidity=" + humidity +
                ", pressure=" + pressure +
                '}';
    }
}
