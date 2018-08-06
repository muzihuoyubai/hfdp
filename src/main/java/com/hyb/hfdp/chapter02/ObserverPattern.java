package com.hyb.hfdp.chapter02;

import com.hyb.hfdp.chapter02.slefimpl.CurrentConditionsDisplayBoard;
import com.hyb.hfdp.chapter02.slefimpl.WeatherData;
import org.junit.Test;

/**
 * 观察者模式
 *
 * @author HYB
 * @since 2018/8/6 23:45
 **/
public class ObserverPattern {

    @Test
    public void selfImplWeatherSubject() {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplayBoard currentConditionsDisplayBoard = new CurrentConditionsDisplayBoard(weatherData);
        weatherData.setChange(123, 32.12f, 3321.12f);
    }
}
