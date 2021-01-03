import java.util.Observable;
import java.util.Observer;

/**
 * Teacher类（具体观察者角色），为了方便，也是通过实现Observer接口来简化实现具体观察者角色的功能
 * 具体观察者（Concrete Observer）角色：实现抽象观察者中定义的抽象方法，以便在得到目标的更改通知时更新自身的状态
 */
public class Teacher implements Observer {
    private String teacherName;

    public Teacher(String teacherName) {
        this.teacherName = teacherName;
    }

    public void update(Observable o, Object arg) {
        Course course = (Course) o;
        Question question = (Question) arg;
        System.out.println(teacherName+"老师的"+course.getCourseName()+"课程接收到-"+question.getUserName()+"提交的问答："+question.getQuestionContent());
    }
}
