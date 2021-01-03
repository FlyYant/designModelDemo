/**
 * 应用层
 */
public class Test {
    public static void main(String[] args) {
        Course course = new Course("设计模式");
        Course course1 = new Course("数据结构");
        Course course2 = new Course("机器学习");
        Course course3 = new Course("算法");
        Course course4 = new Course("计算机网络");
        Course course5 = new Course("RabbitMQ");
        Course course6 = new Course("Docker");

        CourseAggregate courseAggregate = new CourseAggregateImpl();

        courseAggregate.addCourse(course);
        courseAggregate.addCourse(course1);
        courseAggregate.addCourse(course2);
        courseAggregate.addCourse(course3);
        courseAggregate.addCourse(course4);
        courseAggregate.addCourse(course5);
        courseAggregate.addCourse(course6);

        System.out.println("课程列表--------");
        printCourses(courseAggregate);

        courseAggregate.removeCourse(course2);
        courseAggregate.removeCourse(course5);

        printCourses(courseAggregate);

    }

    public static void printCourses(CourseAggregate courseAggregate){
        CourseIterator courseIterator = courseAggregate.getCourseIterator();
        while (!courseIterator.isLastCourse()){
            Course course = courseIterator.nextCourse();
            System.out.println(course.getName());
        }
    }
}
