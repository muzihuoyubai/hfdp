package com.hyb.hfdp.chapter02.javaimpl;

import com.hyb.hfdp.chapter02.slefimpl.WeatherObserver;

import java.util.Observable;
import java.util.Observer;

/**
 * @author HYB
 * @since 2018/8/10 22:40
 **/
public class CurrentConditionsDisplayBoard implements Observer {
    private Observable observable;
    private float temperature;
    private float humidity;
    private float pressure;

    public CurrentConditionsDisplayBoard(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherDataObservable) {
            WeatherDataObservable weatherDataObservable = (WeatherDataObservable) o;
            this.temperature = weatherDataObservable.getTemperature();
            this.humidity = weatherDataObservable.getHumidity();
            this.pressure = weatherDataObservable.getPressure();
            display();
        }
    }

    public void display() {
        System.out.println(this);
    }


    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public void setHumidity(float humidity) {
        this.humidity = humidity;
    }

    public float getPressure() {
        return pressure;
    }

    public void setPressure(float pressure) {
        this.pressure = pressure;
    }

    @Override
    public String toString() {
        return "CurrentConditionsDisplayBoard{" +
                ", temperature=" + temperature +
                ", humidity=" + humidity +
                ", pressure=" + pressure +
                '}';
    }
}
