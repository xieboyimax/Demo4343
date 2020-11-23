package com.zking;

//4.双检锁/双重校验锁（DCL，即 double-checked locking）
public class SingleTon3 {
    // 静态实例变量加上volatile
    private static volatile SingleTon3 instance;

    // 私有化构造函数
    private SingleTon3() {

    }
    public static SingleTon3 getSingleton() {
        if (instance == null) {
            synchronized (SingleTon3.class) {
                if (instance == null) {
                    instance= new SingleTon3();
                }
            }
        }
        return instance;
    }
//ps:这种方式采用双锁机制，安全且在多线程情况下能保持高性能。
//getInstance() 的性能对应用程序很关键。
}
