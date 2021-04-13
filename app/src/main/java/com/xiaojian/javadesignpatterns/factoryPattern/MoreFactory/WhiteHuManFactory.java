package com.xiaojian.javadesignpatterns.factoryPattern.MoreFactory;

import com.xiaojian.javadesignpatterns.factoryPattern.simple.HuMan;
import com.xiaojian.javadesignpatterns.factoryPattern.simple.WhiteHuMan;

/**
 * create_time : 21-4-13 下午3:40
 * author: lk
 * description： BlackHuManFactory 白人创建实现
 */
public class WhiteHuManFactory extends AbstractHuManFactory {
    @Override
    public HuMan createHuMan() {
        return new WhiteHuMan();
    }
}
