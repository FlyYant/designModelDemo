package eHanShi;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Singleton类，单例模式类，在类加载时便会创建一个私有静态变量instance，也就是该类的实例，
 * 再通过公共接口getInstance()来发布该实例，这里使用原子整型实例来记录创建单例模式类实例的次数
 */
public class Singleton {
    private static AtomicInteger count = new AtomicInteger();
    private static Singleton instance = new Singleton();

    //使用一个静态块来创建Singleton类实例，静态块在类加载时会被执行，也就创建了Singleton类实例
    static {
        instance = new Singleton();
    }


    private Singleton(){
        count.getAndAdd(1);
    }

    public static Singleton getInstance(){
        return instance;
    }

    public static AtomicInteger getCount() {
        return count;
    }
}
