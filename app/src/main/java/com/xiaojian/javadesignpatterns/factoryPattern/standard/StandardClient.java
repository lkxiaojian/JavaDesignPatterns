package com.xiaojian.javadesignpatterns.factoryPattern.standard;

/**
 * create_time : 21-4-13 下午3:19
 * author: lk
 * description： SimpleClient 使用方法
 */
public class StandardClient {

    public void createProduct() {
        CreatorIml creatorIml = new CreatorIml();
        ProductIml1 product = creatorIml.createProduct(ProductIml1.class);
        product.method();
    }
}
