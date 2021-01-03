/**
 * CourseBuilder类（抽象类，也可以定义为接口），是课程（产品）的抽象建造者类，定义创建课程实例的各种接口
 */
public abstract class CourseBuilder {

    public abstract void builderCourseName(String courseName);
    public abstract void builderCoursePPT(String coursePPT);
    public abstract void builderCourseVideo(String courseVideo);
    public abstract void builderCourseArticle(String courseArticle);
    public abstract void builderCourseQA(String courseQA);

    public abstract Course makeCourse();
}
