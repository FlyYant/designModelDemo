/**
 * PythonCourseFactory类，是一个具体的产品族工厂（Python课程），实现了产品族的抽象工厂CourseFactory接口
 */
public class PythonCourseFactory implements CourseFactory{
    @Override
    public Video getVideo() {
        return new PythonVideo();
    }

    @Override
    public Article getArticle() {
        return new PythonArticle();
    }
}
