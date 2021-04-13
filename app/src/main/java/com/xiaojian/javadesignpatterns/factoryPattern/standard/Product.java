package com.xiaojian.javadesignpatterns.factoryPattern.standard;

/**
 * create_time : 21-4-13 下午3:06
 * author: lk
 * description： Product
 */
public abstract class Product {
    //Product 产品类的公共方法
    public void doSomething() {
        //处理逻辑
        System.out.println("doSomething");
    }

    //抽象方法
    public abstract void method();

}
