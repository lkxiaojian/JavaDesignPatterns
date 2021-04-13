package com.xiaojian.javadesignpatterns.factoryPattern.standard;

/**
 * create_time : 21-4-13 下午3:15
 * author: lk
 * description： CreatorIml 具体的工厂类
 */
public class CreatorIml extends Creator {
    @Override
    public <T extends Product> T createProduct(Class<T> tClass) {
        Product product = null;
        try {
             product = (Product) Class.forName(tClass.getName()).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        return (T)product;
    }
}
