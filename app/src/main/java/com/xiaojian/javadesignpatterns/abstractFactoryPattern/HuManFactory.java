package com.xiaojian.javadesignpatterns.abstractFactoryPattern;

/**
 * create_time : 21-4-14 上午10:11
 * author: lk
 * description： HuManFactory 工厂定义
 */
public interface HuManFactory {
    HuMan createYellowHuMan();

    HuMan createWhiteHuMan();

    HuMan createBlackHuMan();
}
