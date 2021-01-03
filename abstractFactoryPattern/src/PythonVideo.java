/**
 * PythonVideo类，Python课程这个产品族中的Python视频，继承对应的产品等级结构Video类
 */
public class PythonVideo extends Video{

    @Override
    public void produce() {
        System.out.println("播放python Video！");
    }
}
