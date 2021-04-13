package com.xiaojian.javadesignpatterns.factoryPattern.MoreFactory;

import com.xiaojian.javadesignpatterns.factoryPattern.simple.HuMan;

/**
 * create_time : 21-4-13 下午3:42
 * author: lk
 * description： MoreFactoryClient
 */
public class MoreFactoryClient {

    public void createHuMan(){
        HuMan whiteHuMan = (new WhiteHuManFactory()).createHuMan();
        whiteHuMan.getColor();
        whiteHuMan.talk();
    }
}
