package com.hyb.hfdp.chapter01;

import com.hyb.hfdp.chapter01.model.Duck;
import com.hyb.hfdp.chapter01.model.MallardDuck;

/**
 * 策略模式
 * 多个类只区别在表现行为不同，可以使用Strategy模式，在运行时动态选择具体要执行的行为
 * 需要在不同情况下使用不同的策略(算法)，或者策略还可能在未来用其它方式来实现
 * 对客户隐藏具体策略(算法)的实现细节，彼此完全独立
 * <p>
 * 缺点：
 * 客户端必须知道所有的策略类，并自行决定使用哪一个策略类。
 * 这就意味着客户端必须理解这些算法的区别，以便适时选择恰当的算法类。
 * 换言之，策略模式只适用于客户端知道所有的算法或行为的情况
 *
 * @author HYB
 * @since 2018/8/5 16:49
 **/
public class StrategyPattern {
    public static void main(String[] args) {
        Duck duck = new MallardDuck();
        duck.display();
        duck.fly();
        duck.swim();
        duck.quack();
    }
}
