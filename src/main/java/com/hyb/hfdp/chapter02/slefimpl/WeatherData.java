package com.hyb.hfdp.chapter02.slefimpl;

import java.util.ArrayList;
import java.util.List;

/**
 * 气象的主题的手动实现
 *
 * @author HYB
 * @since 2018/8/6 23:46
 **/
public class WeatherData implements WeatherSubject {

    private List<WeatherObserver> observersInRegister = new ArrayList<>();
    private float temperature;
    private float humidity;
    private float pressure;

    public void setChange(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        notifyObservers();
    }

    @Override
    public void registerObserver(WeatherObserver observer) {
        observersInRegister.add(observer);
    }

    @Override
    public void removeObserver(WeatherObserver observer) {
        int index = observersInRegister.indexOf(observer);
        if (index >= 0) {
            observersInRegister.remove(observer);
        }
    }

    @Override
    public void notifyObservers() {
        for (WeatherObserver one : observersInRegister) {
            one.update(temperature, humidity, pressure);
        }
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

    public List<WeatherObserver> getObserversInRegister() {
        return observersInRegister;
    }

    public void setObserversInRegister(List<WeatherObserver> observersInRegister) {
        this.observersInRegister = observersInRegister;
    }
}
