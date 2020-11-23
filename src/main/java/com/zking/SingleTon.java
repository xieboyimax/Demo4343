package com.zking;

//懒汉模式:类加载时完成初始化，创建出实例对象（不管用不用，先创建）。
public class SingleTon {
    //定义一个静态变量
    private  static SingleTon instance;

    //定义私有的构造函数
    private SingleTon() {};


//1.懒汉式，线程不安全
 //定义获取方法
    public static SingleTon getinstance() {
        if(instance==null){
            instance = new SingleTon();
        }
        return instance;
    };
//ps:这种方式是最基本的实现方式，这种实现最大的问题就是不支持多线程。因为没有加锁 synchronized


//2、懒汉式，线程安全
    public static synchronized SingleTon getInstance() {
        if (instance == null) {
            instance = new SingleTon();
        }
        return instance;
    }
//ps:这种方式具备很好的 lazy loading，能够在多线程中很好的工作，但是，效率很低，99% 情况下不需要同步
//优点：第一次调用才初始化，避免内存浪费。
//缺点：必须加锁 synchronized 才能保证单例，但加锁会影响效率。

}
