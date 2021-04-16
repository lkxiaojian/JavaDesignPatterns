package com.xiaojian.javadesignpatterns.builder;

/**
 * create_time : 21-4-16 上午9:14
 * author: lk
 * description： BuilderClient
 */
public class BuilderClient {
    private Builder builder = new ConcreteBuilder();
    //构建不同的产品
    public Product getProduct() {
        builder.setPart();
        return builder.buildProduct();
    }
}
