package com.xiaojian.javadesignpatterns.TemplatePattern;

/**
 * create_time : 21-4-14 下午2:39
 * author: lk
 * description： ConcreteClass1 具体模板类1
 */
public class ConcreteClass1  extends  AbstractClass{
    @Override
    protected void doSomething() {
        System.out.println("ConcreteClass1 doSomething");

    }

    @Override
    protected void doAnything() {
        System.out.println("ConcreteClass1 doAnything");
    }
}
