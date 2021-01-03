package simpleFactoryPattern;

/**
 * JavaVideo类，Java视频类，继承Video类
 */
public class JavaVideo extends Video{
    @Override
    public void produce() {
        System.out.println("播放java Video！");
    }
}
