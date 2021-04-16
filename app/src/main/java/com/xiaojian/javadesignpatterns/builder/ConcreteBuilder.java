package com.xiaojian.javadesignpatterns.builder;

/**
 * create_time : 21-4-16 上午9:12
 * author: lk
 * description： ConcreteBuilder 具体的建造者
 */
public class ConcreteBuilder extends Builder{
    private Product product=new Product();

    @Override
    public void setPart() {
        //产品内部逻辑
    }

    @Override
    public Product buildProduct() {
        return product;
    }
}
