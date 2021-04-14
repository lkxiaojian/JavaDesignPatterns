package com.xiaojian.javadesignpatterns.TemplatePattern;

/**
 * create_time : 21-4-14 下午2:35
 * author: lk
 * description： AbstractClass 抽象模板类
 */
public abstract class AbstractClass {
    protected abstract void doSomething();

    protected abstract void doAnything();

    public void templateMethod() {
        this.doSomething();
        this.doAnything();
    }

}
