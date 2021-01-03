package jingTaiNeiBuLei;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * 静态内部类式（线程安全）
 * 单线程测试还是多线程测试这里都是没有问题的
 */
public class Singleton {
    private static AtomicInteger count = new AtomicInteger();

    private Singleton(){
        count.getAndAdd(1);
    }

    public static Singleton getInstance(){
        return Inner.instance;
    }

    public static AtomicInteger getCount() {
        return count;
    }
    private static class Inner{
        private static final Singleton instance = new Singleton();
    }
}
