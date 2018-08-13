package com.hyb.hfdp.chapter03;

import com.hyb.hfdp.chapter03.charlowcase.LowcaseInputStream;
import com.hyb.hfdp.chapter03.startbuzz.coffee.BaseBeverage;
import com.hyb.hfdp.chapter03.startbuzz.coffee.DarkRoast;
import com.hyb.hfdp.chapter03.startbuzz.coffee.Espresso;
import com.hyb.hfdp.chapter03.startbuzz.condiment.Mocha;
import com.hyb.hfdp.chapter03.startbuzz.condiment.Whip;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * 装饰者模式
 * 　　在不必改变原类文件和使用继承的情况下，动态地扩展一个对象的功能。它是通过创建一个包装对象，也就是装饰来包裹真实的对象。
 * 　　装饰对象和真实对象有相同的接口。这样客户端对象就能以和真实对象相同的方式和装饰对象交互
 * 　　装饰对象包含一个真实对象的引用
 * 　　装饰对象接受所有来自客户端的请求。它把这些请求转发给真实的对象
 * 　　装饰对象可以在转发这些请求以前或以后增加一些附加功能。这样就确保了在运行时，不用修改给定对象的结构就可以在外部增加附加的功能。
 * 　　在面向对象的设计中，通常是通过继承来实现对给定类的功能扩展
 * <p>
 * 以下情况使用Decorator模式
 * 1. 需要扩展一个类的功能，或给一个类添加附加职责。
 * 2. 需要动态的给一个对象添加功能，这些功能可以再动态的撤销。
 * 3. 需要增加由一些基本功能的排列组合而产生的非常大量的功能，从而使继承关系变的不现实。
 * 4. 当不能采用生成子类的方法进行扩充时。
 * 　　一种情况是，可能有大量独立的扩展，为支持每一种组合将产生大量的子类，使得子类数目呈爆炸性增长。
 * 　　另一种情况可能是因为类定义被隐藏，或类定义不能用于生成子类。
 * <p>
 * 在装饰模式中的各个角色有：
 * 　　（1）抽象构件（Component）角色：给出一个抽象接口，以规范准备接收附加责任的对象。
 * 　　（2）具体构件（Concrete Component）角色：定义一个将要接收附加责任的类。
 * 　　（3）装饰（Decorator）角色：持有一个构件（Component）对象的实例，并实现一个与抽象构件接口一致的接口。
 * 　　（4）具体装饰（Concrete Decorator）角色：负责给构件对象添加上附加的责任。
 *
 * @author HYB
 * @since 2018/8/12 0:07
 **/
public class DecoratorPattern {

    private static final String target = "I know the Decorator Pattern therefore I RULE!";

    @Test
    public void orderOneCoffee() {
        BaseBeverage baseBeverage = new Espresso();
        System.out.println(baseBeverage);

        BaseBeverage mixBeverage = new DarkRoast();
        mixBeverage = new Mocha(mixBeverage);
        mixBeverage = new Mocha(mixBeverage);
        mixBeverage = new Whip(mixBeverage);
        System.out.println(mixBeverage);
    }

    @Test
    public void toLowercaseInputStreamTest() throws IOException {
        InputStream is = new LowcaseInputStream(new ByteArrayInputStream(target.getBytes()));
        int c;
        while ((c = is.read()) != -1) {
            System.out.print((char) c);
        }
    }
}
