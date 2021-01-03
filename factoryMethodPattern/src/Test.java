/**
 * 应用层
 * 当我们需要增加一个新的视频时，工厂方法模式很好的遵守了开闭原则，我们只需要增加对应的视频类和创建该视频对象的具体工厂即可
 */
public class Test {
    public static void main(String[] args) {
        VideoFactory videoFactory = new FEVideoFactory();
        Video video = videoFactory.getVideo();
        video.produce();
    }
}
