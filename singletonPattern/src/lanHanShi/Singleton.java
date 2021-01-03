package lanHanShi;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * 单重检查（线程不安全）
 * 单线程测试是没问题的。
 * 多线程测试出现了问题，创建了10个不同实例
 */
public class Singleton {
    private static AtomicInteger count = new AtomicInteger();
    private static volatile Singleton instance ;

    private Singleton(){
        count.getAndAdd(1);
    }

    //因此在获取单例模式类实例的方法getInstance()上加上synchronized关键字
    //加上后单线程测试和多线程测试都没问题。
    //但这种将方法同步或者将大部分代码进行同步会导致该方法的同步锁非常重量级（当业务非常复杂时），
    // 所以我们应该减少代码同步的范围，这里我们主要担心instance = new Singleton()会在多线程下被执行多次，这就违背了单例模式的初衷，所以将instance = new Singleton()代码进行同步
    public synchronized static Singleton getInstance(){

        if(instance == null){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("出错啦!");
            }
            //为了防止问题使用单重锁
            //将方法名中的synchronized去掉，然后在下方加入
            //synchronized (Singleton.class){
            //                instance = new Singleton();
            //            }
            //让instance = new Singleton();进行同步
            //结果单线程测试也是没问题的。
            //多线程测试也出现了问题，同样创建了10个不同实例
            //为了解决这种问题，就需要双重检查锁式这种方法。
            //用volatile修饰instance，再使用双重检查锁，这种单例模式类创建实例是线程安全的
            //volatile加载声明对象的地方也就是最上面private的地方
            //无论是单线程测试还是多线程测试这里都是没有问题的，可以多测试几遍，思考为什么这样就没有问题了
            instance = new Singleton();
        }
        return instance;
    }

    public static AtomicInteger getCount() {
        return count;
    }
}
