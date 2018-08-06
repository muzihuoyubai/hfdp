package com.hyb.hfdp.chapter02.slefimpl;

/**
 * 自定义主题
 *
 * @author HYB
 * @since 2018/8/6 23:47
 **/
public interface WeatherSubject {

    void registerObserver(WeatherObserver observer);

    void removeObserver(WeatherObserver observer);

    void notifyObservers();

}
