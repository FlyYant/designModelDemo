import java.util.Observable;

/**
 * Course类（具体主题角色），这里不自己实现具体主题角色的功能，通过继承Observable类，便可以很方便的实现这些功能，
 * 其实实现这些功能也不难，但要做到高性能、线程安全也有一定难度，大家可以构思一下怎么实现
 * 具体主题（Concrete Subject）角色：也叫具体目标类，它实现抽象目标中的通知方法，当具体主题的内部状态发生改变时，通知所有注册过的观察者对象
 */
public class Course extends Observable {
    private String courseName;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void produceQuestion(Course course , Question question){
        System.out.println(question.getUserName()+"在"+course.courseName+"提交了问题");
        setChanged();
        notifyObservers(question);
    }
}
