package objectAda;

/**
 * 应用层
 */
public class objTest {
    public static void main(String[] args) {
        objTarget target = new objConcreteTarget();
        target.request();

        objTarget adapterTarget = new objAdapter();
        adapterTarget.request();
    }
}