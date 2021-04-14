package com.xiaojian.javadesignpatterns.singleton;

/**
 * create_time : 21-4-13 上午10:39
 * author: lk
 * description： Singleton   单例模式
 */
public class SingletonClient {

    public void doubleCheckedLockingLazySingleton(){
        DoubleCheckedLockingLazySingleton instance = DoubleCheckedLockingLazySingleton.getInstance();
        instance.whateverMethod();
    }
    public void hungrySingleton(){
        HungrySingleton instance = HungrySingleton.getInstance();
        instance.whateverMethod();
    }
    public void enumSingleton(){
        EnumSingleton instance = EnumSingleton.INSTANCE;
        instance.whateverMethod();
    }
    public void lazyUnsafeSingleton(){
        LazyUnsafeSingleton instance = LazyUnsafeSingleton.getInstance();
        instance.whateverMethod();
    }
    public void lazySafeSingleton(){
        LazySafeSingleton instance = LazySafeSingleton.getInstance();
        instance.whateverMethod();
    }

}
