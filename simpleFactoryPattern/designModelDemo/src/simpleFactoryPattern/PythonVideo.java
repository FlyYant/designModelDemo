package simpleFactoryPattern;

/**
 * PythonVideo类，Python视频类，继承Video类
 */
public class PythonVideo extends Video{

    @Override
    public void produce() {
        System.out.println("播放python Video！");
    }
}
