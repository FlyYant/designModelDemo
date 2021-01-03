import java.util.ArrayList;
import java.util.List;

/**
 * CourseAggregateImpl类（具体容器），实现了CourseAggregate接口
 * 具体容器（ConcreteAggregate）：创建具体迭代器
 */
public class CourseAggregateImpl implements CourseAggregate{
    private List courseList;

    public CourseAggregateImpl() {
        this.courseList = new ArrayList();
    }

    public void addCourse(Course course) {
        courseList.add(course);
    }

    public void removeCourse(Course course) {
        courseList.remove(course);
    }

    public CourseIterator getCourseIterator() {
        return new CourseIteratorImpl(courseList);
    }
}
