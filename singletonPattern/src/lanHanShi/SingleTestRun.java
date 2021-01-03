package lanHanShi;


/**
 * 多线程应用
 */
public class SingleTestRun {
    //静态设置线程数，这里采用了阿里规范的不使用魔法值
    private static final int THREAD_NUMBER = 10;

    public static void main(String[] args) throws InterruptedException {
        Thread[] threads2 = new Thread[THREAD_NUMBER];
        MyRunnable myRunnable = new MyRunnable();
        for (int i = 0; i < THREAD_NUMBER; i++) {
            threads2[i] = new Thread(myRunnable);
            threads2[i].setName("线程"+i);
            threads2[i].start();
        }
        for (int i = 0; i < THREAD_NUMBER; i++) {
            threads2[i].join();
        }
        System.out.println("线程全部执行完成！");
        System.out.println("创建了 "+ Singleton.getCount()+" 次单例模式类实例");
    }
}
