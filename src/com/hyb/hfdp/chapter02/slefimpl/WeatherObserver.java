package com.hyb.hfdp.chapter02.slefimpl;

/**
 * TODO
 *
 * @author HYB
 * @since 2018/8/7 0:09
 **/
public interface WeatherObserver {

    void update(float temperature, float humidity, float pressure);
}
