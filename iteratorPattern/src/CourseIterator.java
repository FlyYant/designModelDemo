/**
 * CourseIterator接口（抽象迭代器）
 * 抽象迭代器（Iterator）：抽象迭代器负责定义访问和遍历元素的接口
 */
public interface CourseIterator {
    Course nextCourse();
    boolean isLastCourse();
}
