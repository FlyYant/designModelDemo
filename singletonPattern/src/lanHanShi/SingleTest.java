package lanHanShi;

/**
 * 应用层
 * 用单线程进行测试，创建单例模式类实例10000000次，结果没问题
 */
public class SingleTest {
    public static void main(String[] args) {

        for (int i = 0; i < 10000000; i++) {
            Singleton singleton = Singleton.getInstance();
        }
        System.out.println("创建了 "+ Singleton.getCount()+" 次单例模式类实例");
    }
}
