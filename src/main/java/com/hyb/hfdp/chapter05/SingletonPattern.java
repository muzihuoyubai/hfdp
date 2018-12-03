package com.hyb.hfdp.chapter05;

import com.hyb.hfdp.chapter05.impl.HungarySafe;
import com.hyb.hfdp.chapter05.impl.HungaryUnsafe;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.*;
import java.util.stream.Collectors;

/**
 * 单例模式
 *
 * @author HYB
 * @since 2018/12/3 22:36
 **/
public class SingletonPattern {


    @Test
    public void test() {
        int count;
//        singletonReliableTest(HungaryUnsafe.class);
        count = singletonReliableTest(HungarySafe.class);
        Assert.assertEquals(1, count);
    }


    /**
     * 测试一个单例模式的实现类是否真的是单例的
     * 传入一个
     * System.identityHashCode(obj)来获取内存地址
     */
    public int singletonReliableTest(Class<? extends SingletonInstance> target) {
        int max = 50000;
        ExecutorService cachedThreadPool = Executors.newFixedThreadPool(max);
        List<Future<String>> uniqueChecker = new ArrayList<>();
        for (int i = 0; i < max; i++) {
            Future<String> future = cachedThreadPool.submit(() -> System.identityHashCode(target.getMethod("getInstance").invoke(null)) + "");
            uniqueChecker.add(future);
        }
        cachedThreadPool.shutdown();
        Set<String> collect = uniqueChecker.stream().map(t -> {
            try {
                return t.get();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }

        }).collect(Collectors.toSet());
        System.out.println(collect);
        return collect.size();
    }
}
