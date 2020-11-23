package com.zking;

//3.饿汉模式
//懒汉和饿汉的最大区别就在于创建对象时候是否实例化；有new就是饿汉，反之就是懒汉，跟加不加synchronized ，没有关系
public class SingleTon2 {

    private static SingleTon2 instance = new SingleTon2();
    private SingleTon2 (){}
    public static SingleTon2 getInstance() {
        return instance;
    }
//PS:这种方式比较常用，但容易产生垃圾对象。
//优点：没有加锁，执行效率会提高。它基于 classloder 机制避免了多线程的同步问题.
//缺点：类加载时就初始化，浪费内存。
//
}
