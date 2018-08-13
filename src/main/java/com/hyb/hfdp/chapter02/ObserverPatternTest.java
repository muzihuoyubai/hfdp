package com.hyb.hfdp.chapter02;

import com.hyb.hfdp.chapter02.javaimpl.WeatherDataObservable;
import com.hyb.hfdp.chapter02.slefimpl.CurrentConditionsDisplayBoard;
import com.hyb.hfdp.chapter02.slefimpl.WeatherData;
import org.junit.Test;

/**
 * 观察者模式
 * 观察者设计模式定义了对象间的一种一对多的组合关系，以便一个对象的状态发生变化时，所有依赖于它的对象都得到通知并自动刷新。
 * <p>
 * 观察者和被观察对象之间的互动关系不能体现成类之间的直接调用，否则就将使观察者和被观察对象之间紧密的耦合起来，
 * 使用此模式时，你可从被观察者处推（push）或拉（pull）数据（然而，推的方式被认为更“正确”）。
 * 有多个观察者时，不可以依赖特定的通知次序
 * <p>
 * 观察者
 * （Observer）将自己注册到被观察对象（Subject）中，被观察对象将观察者存放在一个容器（Container）里。
 * 被观察
 * 被观察对象发生了某种变化，从容器中得到所有注册过的观察者，将变化通知观察者。
 * 撤销观察
 * 观察者告诉被观察者要撤销观察，被观察者从容器中将观察者去除。
 * <p>
 * 应用：JavaBeans、RMI
 *
 * @author HYB
 * @since 2018/8/6 23:45
 **/
public class ObserverPatternTest {

    @Test
    public void selfImplWeatherSubject() {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplayBoard currentConditionsDisplayBoard = new CurrentConditionsDisplayBoard(weatherData);
        weatherData.setChange(123, 32.12f, 3321.12f);
    }

    @Test
    public void javaImplWeatherObservable() {
        WeatherDataObservable weatherDataObservable = new WeatherDataObservable();
        com.hyb.hfdp.chapter02.javaimpl.CurrentConditionsDisplayBoard currentConditionsDisplayBoard = new com.hyb.hfdp.chapter02.javaimpl.CurrentConditionsDisplayBoard(weatherDataObservable);
        weatherDataObservable.measurementsChanged(22, 33, 444);
    }
}
