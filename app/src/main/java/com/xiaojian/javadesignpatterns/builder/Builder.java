package com.xiaojian.javadesignpatterns.builder;

/**
 * create_time : 21-4-16 上午9:09
 * author: lk
 * description： Builder 抽象建造者
 */
public abstract class Builder {
    //设置产品不同部分，从而获得不同的产品
    public abstract void setPart();
    //设置产品
    public abstract Product buildProduct();
}
