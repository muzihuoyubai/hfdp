package com.hyb.hfdp.chapter02.slefimpl;

/**
 * 气象观察者的手动实现
 *
 * @author HYB
 * @since 2018/8/7 0:09
 **/
public interface WeatherObserver {

    void update(float temperature, float humidity, float pressure);
}
