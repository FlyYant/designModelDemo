/**
 * FEVideoFactory类，负责创建FEVideo对象的具体工厂类，继承抽象工厂
 */
public class FEVideoFactory extends VideoFactory{
    @Override
    public Video getVideo() {
        return new FEVideo();
    }
}
