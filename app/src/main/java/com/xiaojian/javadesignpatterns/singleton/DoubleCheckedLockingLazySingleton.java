package com.xiaojian.javadesignpatterns.singleton;

/**
 * create_time : 21-4-13 上午11:00
 * author: lk
 * description： DoubleCheckedLockingLazySingleton
 */
public class DoubleCheckedLockingLazySingleton {
    /**
     * JDK 版本：JDK1.5 起
     * 是否 Lazy 初始化：是
     * 是否多线程安全：是
     * 实现难度：较复杂
     * 描述：这种方式采用双锁机制，安全且在多线程情况下能保持高性能。
     * getInstance() 的性能对应用程序很关键。
     */
    private DoubleCheckedLockingLazySingleton() {
    }
    private static DoubleCheckedLockingLazySingleton doubleCheckedLockingLazySingleton;
    public static synchronized DoubleCheckedLockingLazySingleton getInstance() {
        if (doubleCheckedLockingLazySingleton == null) {
            synchronized (DoubleCheckedLockingLazySingleton.class) {
                if (doubleCheckedLockingLazySingleton == null) {
                    doubleCheckedLockingLazySingleton = new DoubleCheckedLockingLazySingleton();
                }
            }
        }

        return doubleCheckedLockingLazySingleton;
    }
    public void whateverMethod(){
    }
}
