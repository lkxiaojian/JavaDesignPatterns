package com.xiaojian.javadesignpatterns.factoryPattern.MoreFactory;

import com.xiaojian.javadesignpatterns.factoryPattern.simple.HuMan;
import com.xiaojian.javadesignpatterns.factoryPattern.simple.WhiteHuMan;
import com.xiaojian.javadesignpatterns.factoryPattern.simple.YellowHuMan;

/**
 * create_time : 21-4-13 下午3:40
 * author: lk
 * description： BlackHuManFactory 黄人创建实现
 */
public class YellowHuManFactory extends AbstractHuManFactory {
    @Override
    public HuMan createHuMan() {
        return new YellowHuMan();
    }
}
