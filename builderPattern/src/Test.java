/**
 * 应用层代码
 */
public class Test {
    public static void main(String[] args) {
        CourseBuilder courseBuilder = new CourseActualBuilder();
        Coach coach = new Coach();
        coach.setCourseBuilder(courseBuilder);

        Course course = coach.makeCourse("Java设计模式","Java设计模式PPT",
                "Java设计模式视频","Java设计模式手记","Java设计模式问答");
        System.out.println(course);


        //改进后的应用层代码
        Course2 course2 = new Course2.CourseBuilder().buildCourseName("Java设计模式")
                .buildCoursePPT("Java设计模式PPT").buildCourseVideo("Java设计模式视频")
                .buildCourseArticle("Java设计模式手记").buildCourseQA("Java设计模式问答").build();
        System.out.println(course2 );
        //与未改进的版本相比，通过链式调用对课程实例属性进行初始化更加友好，还不容易出错，像下面创建课程实例的代码，属性值很容易写错位置，改进版本的建造者模式在很多中间件以及框架中有使用
        //Course course = coach.makeCourse("Java设计模式","Java设计模式PPT",
        //                "Java设计模式视频","Java设计模式手记","Java设计模式问答");
    }
}
//此案例看起来比较复杂，因此进行改进，使用静态内部类可以改进建造者模式