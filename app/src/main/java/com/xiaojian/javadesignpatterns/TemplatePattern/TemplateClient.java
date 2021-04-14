package com.xiaojian.javadesignpatterns.TemplatePattern;

/**
 * create_time : 21-4-14 下午2:33
 * author: lk
 * description： TemplateClient 模板方法模式
 */
public class TemplateClient {
    public void templatePattern() {
        ConcreteClass1 concreteClass1 = new ConcreteClass1();
        concreteClass1.templateMethod();
        ConcreteClass2 concreteClass2 = new ConcreteClass2();
        concreteClass2.templateMethod();
    }
}
