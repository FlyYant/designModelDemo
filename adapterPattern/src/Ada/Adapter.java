package Ada;

/**
 * 适配器： Ada.Adapter, 将被适配者和目标接口组合到一起的类
 * Adapter类，继承了Adaptee类，实现了Target接口
 */
public class Adapter extends Adaptee implements Target{
    @Override
    public void request() {
        super.adapterRequest();
    }
}
//Adapter类继承了Adaptee类，所以称为类适配器。
