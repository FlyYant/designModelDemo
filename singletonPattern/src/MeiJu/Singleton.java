package MeiJu;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * 枚举单例式
 */
public enum  Singleton {
    INSTANCE;

    //可以省略此方法，通过Singleton.INSTANCE进行操作
    public static Singleton getInstance(){
        return INSTANCE;
    }
}
