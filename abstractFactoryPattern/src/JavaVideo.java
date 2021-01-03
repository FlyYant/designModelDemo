/**
 * JavaVideo类，Java课程这个产品族中的Java视频，继承对应的产品等级结构Video类
 */
public class JavaVideo extends Video{
    @Override
    public void produce() {
        System.out.println("播放java Video！");
    }
}
