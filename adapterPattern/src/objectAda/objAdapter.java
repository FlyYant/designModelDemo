package objectAda;

/**
 * 适配器： Ada.Adapter, 将被适配者和目标接口组合到一起的类
 *
 */
public class objAdapter implements objTarget {
    private objAdaptee adaptee = new objAdaptee();

    public void request() {
        adaptee.adapterRequest();
    }
}
//Adapter类没有继承Adaptee类，而是与Adaptee类实例进行组合，这便是对象适配器
