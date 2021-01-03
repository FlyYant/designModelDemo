package simpleFactoryPattern;

/**
 * 应用层
 * 这里发现一个问题：
 * 应用层代码太依赖对应的类，高层模块（应用层）不应该依赖低层模块（逻辑层），这违背了依赖倒置原则
 * 进行改进：
 * 添加一个工厂类VideoFactory类
 */
public class Test {
    public static void main(String[] args){
        //改进之前的方法
        Video video = new JavaVideo();
        video.produce();

        //改进之后的方法
        VideoFactory videoFactory = new VideoFactory();
        Video video1 = videoFactory.getVideo("java");
        video1.produce();

        //这样我们就不需要依赖对应的类了，只需要给工厂类传入类的标识字符串即可
        //但是问题再一次出现，如果工厂类中创建的“产品”很多，相对的if-else就会用的很多，容易出现问题
        //所以继续改进VideoFactory类，为了区分，这里的改进使用编号2改进

        //编号2改进
        VideoFactory videoFactory2 = new VideoFactory();
        Video video2 = videoFactory2.getVideo2(JavaVideo.class);
        video2.produce();
    }
}
