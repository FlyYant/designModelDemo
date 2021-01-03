/**
 * PythonVideoFactory类，负责创建PythonVideo对象的具体工厂类，继承抽象工厂
 */
public class PythonVideoFactory extends VideoFactory {
    @Override
    public Video getVideo() {
        return new PythonVideo();
    }
}
