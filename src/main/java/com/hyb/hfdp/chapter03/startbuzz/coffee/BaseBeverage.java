package com.hyb.hfdp.chapter03.startbuzz.coffee;

/**
 * 饮料抽象类
 *
 * @author HYB
 * @since 2018/8/12 14:25
 **/
public abstract class BaseBeverage {
    private String description = "Unknown BaseBeverage";

    /**
     * 获取饮料价格
     *
     * @return
     */
    public abstract double cost();

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "BaseBeverage{" +
                "description='" + getDescription() + '\'' +
                "$" + cost() +
                '}';
    }
}
