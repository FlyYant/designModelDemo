/**
 * CourseAggregate接口（抽象容器）
 * 抽象容器（Aggregate）：负责定义提供具体迭代器的接口
 */
public interface CourseAggregate {
    void addCourse(Course course);
    void removeCourse(Course course);

    CourseIterator getCourseIterator();
}
