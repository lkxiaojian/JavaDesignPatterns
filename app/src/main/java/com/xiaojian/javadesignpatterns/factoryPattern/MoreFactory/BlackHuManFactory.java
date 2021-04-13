package com.xiaojian.javadesignpatterns.factoryPattern.MoreFactory;

import com.xiaojian.javadesignpatterns.factoryPattern.simple.BlackHuMan;
import com.xiaojian.javadesignpatterns.factoryPattern.simple.HuMan;

/**
 * create_time : 21-4-13 下午3:40
 * author: lk
 * description： BlackHuManFactory 黑人创建实现
 */
public class BlackHuManFactory extends AbstractHuManFactory {
    @Override
    public HuMan createHuMan() {
        return new BlackHuMan();
    }
}
