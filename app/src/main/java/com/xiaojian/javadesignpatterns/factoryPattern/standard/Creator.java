package com.xiaojian.javadesignpatterns.factoryPattern.standard;

/**
 * create_time : 21-4-13 下午3:13
 * author: lk
 * description： Creator 抽象工厂类
 */
public abstract class Creator {
    public abstract <T extends Product> T createProduct(Class<T> tClass);
}
