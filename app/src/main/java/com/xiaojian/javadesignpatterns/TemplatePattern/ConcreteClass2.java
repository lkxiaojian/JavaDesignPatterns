package com.xiaojian.javadesignpatterns.TemplatePattern;

/**
 * create_time : 21-4-14 下午2:39
 * author: lk
 * description： ConcreteClass2   具体模板类2
 */
public class ConcreteClass2 extends  AbstractClass{
    @Override
    protected void doSomething() {
        System.out.println("ConcreteClass2 doSomething");

    }

    @Override
    protected void doAnything() {
        System.out.println("ConcreteClass2 doAnything");
    }
}
