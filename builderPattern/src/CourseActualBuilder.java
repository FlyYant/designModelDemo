/**
 * CourseActualBuilder类，是课程（产品）真正的创建者类
 */
public class CourseActualBuilder extends CourseBuilder{

    private Course course = new Course();

    @Override
    public void builderCourseName(String courseName) {
        course.setCourseName(courseName);
    }

    public void builderCoursePPT(String coursePPT) {
        course.setCoursePPT(coursePPT);
    }

    public void builderCourseVideo(String courseVideo) {
        course.setCourseVideo(courseVideo);
    }

    public void builderCourseArticle(String courseArticle) {
        course.setCourseArticle(courseArticle);
    }

    public void builderCourseQA(String courseQA) {
        course.setCourseQA(courseQA);
    }

    public Course makeCourse() {
        return course;
    }
}
