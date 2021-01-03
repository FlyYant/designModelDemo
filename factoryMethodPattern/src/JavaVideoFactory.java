/**
 * JavaVideoFactory类，负责创建JavaVideo对象的具体工厂类，继承抽象工厂
 */
public class JavaVideoFactory extends VideoFactory{
    public Video getVideo() {
        return new JavaVideo();
    }
}
