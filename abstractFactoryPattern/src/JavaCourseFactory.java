/**
 * JavaCourseFactory类，是一个具体的产品族工厂（Java课程），实现了产品族的抽象工厂CourseFactory接口
 */
public class JavaCourseFactory implements CourseFactory{
    @Override
    public Video getVideo() {
        return new JavaVideo();
    }

    @Override
    public Article getArticle() {
        return new JavaArticle();
    }
}
