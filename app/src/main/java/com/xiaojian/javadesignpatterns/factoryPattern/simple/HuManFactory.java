package com.xiaojian.javadesignpatterns.factoryPattern.simple;

/**
 * create_time : 21-4-13 下午3:32
 * author: lk
 * description： HuManFactory
 */
public class HuManFactory  {

    public  static <T extends HuMan> T createHuMan(Class<T> tClass) {
        HuMan huMan=null;
        try {
             huMan = (HuMan) Class.forName(tClass.getName()).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        return (T)huMan;
    }
}
