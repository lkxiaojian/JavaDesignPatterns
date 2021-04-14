package com.xiaojian.javadesignpatterns.factoryPattern.standard;

/**
 * create_time : 21-4-13 下午3:19
 * author: lk
 * description： SimpleClient 标准的工厂模式
 */
public class StandardClient {

    public void createProduct() {
        CreatorIml creatorIml = new CreatorIml();
        ProductIml1 product = creatorIml.createProduct(ProductIml1.class);
        product.method();
    }
}
