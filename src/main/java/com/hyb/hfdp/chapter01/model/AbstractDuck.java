package com.hyb.hfdp.chapter01.model;

/**
 * 使用组合的方式
 * <p>
 * 原则：
 * 多用组合少用继承
 * 针对接口编程，不针对实现编程
 * 封装变化
 *
 * @author HYB
 * @since 2018/8/5 17:20
 **/
public abstract class AbstractDuck {
    private FlyBehavior flyBehavior;
    private QuackBehavior quackBehavior;

    public AbstractDuck() {
        this.flyBehavior = new FlyBehaviorDefault();
        this.quackBehavior = new QuackBehaviorDefault();
    }

    public AbstractDuck(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
        this.flyBehavior = flyBehavior;
        this.quackBehavior = quackBehavior;
    }

    public abstract void display();

    public void quack() {
        quackBehavior.quack();
    }

    public void swim() {
        System.out.println("swimming");
    }

    public void fly() {
        flyBehavior.fly();
    }

    public FlyBehavior getFlyBehavior() {
        return flyBehavior;
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public QuackBehavior getQuackBehavior() {
        return quackBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
