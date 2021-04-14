package com.xiaojian.javadesignpatterns.factoryPattern.MoreFactory;

import com.xiaojian.javadesignpatterns.factoryPattern.simple.HuMan;

/**
 * create_time : 21-4-13 下午3:31
 * author: lk
 * description： AbstractHuManFactory 多工厂模式的抽象工厂类
 */
public abstract  class AbstractHuManFactory {

    public abstract  HuMan createHuMan();
}
