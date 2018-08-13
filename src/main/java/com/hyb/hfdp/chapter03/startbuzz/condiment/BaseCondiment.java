package com.hyb.hfdp.chapter03.startbuzz.condiment;

import com.hyb.hfdp.chapter03.startbuzz.coffee.BaseBeverage;

/**
 * 调料,用于装饰饮料
 *
 * @author HYB
 * @since 2018/8/12 14:27
 **/
public abstract class BaseCondiment extends BaseBeverage {

    /**
     * 强制子类必须重写该方法
     *
     * @return
     */
    @Override
    public abstract String getDescription();
}
