import java.util.List;

/**
 * CourseIteratorImpl类（具体迭代器），实现了CourseIterator接口，方法名的命名不用纠结
 * 具体迭代器（ConcreteIterator）：提供具体的元素遍历行为
 */
public class CourseIteratorImpl implements CourseIterator{
    private List courseList;
    private int position;
    private Course course;

    public CourseIteratorImpl(List courseList) {
        this.courseList = courseList;
    }

    public Course nextCourse() {
        System.out.println("返回课程，位置是："+position);
        course = (Course) courseList.get(position);
        position++;
        return course;
    }

    public boolean isLastCourse() {
        if(position < courseList.size()){
            return false;
        }
        return true;
    }
}
