import java.util.Date;

/**
 * StudyGroup类（中介者），相当于交流群
 */
public class StudyGroup {
    public static void showMessage(User user , String message){
        System.out.println(new Date().toString() + " ["+user.getName()+"]："+message);
    }
}
