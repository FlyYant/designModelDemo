/**
 * Coach类，是一个指挥者类，应用层可以通过指挥者类进行产品实例的创建，而不是直接调用建造者类的相关方法
 */
public class Coach {

    private CourseBuilder courseBuilder;

    public void setCourseBuilder(CourseBuilder courseBuilder){
        this.courseBuilder = courseBuilder;
    }

    public Course makeCourse(String courseName, String coursePPT,
                             String courseVideo, String courseArticle,
                             String courseQA){
        this.courseBuilder.builderCourseName(courseName);
        this.courseBuilder.builderCoursePPT(coursePPT);
        this.courseBuilder.builderCourseVideo(courseVideo);
        this.courseBuilder.builderCourseArticle(courseArticle);
        this.courseBuilder.builderCourseQA(courseQA);
        return this.courseBuilder.makeCourse();

    }
}
