package com.zking;

//5.SingleTon登记式/静态内部类
public class SingleTon4 {
    //在静态内部类中定义静态实例变量，直接初始化
    private static class SingletonHolder {
        private static final SingleTon4 INSTANCE = new SingleTon4();
    }
    // 私有化构造函数
    private SingleTon4 (){}

    public static final SingleTon4 getInstance() {
        return SingletonHolder.INSTANCE;
    }
//ps:这种方式能达到双检锁方式一样的功效，但实现更简单。
//适用于要求明确实现 lazy loading 效果。
}
