/**
 * CourseVideo类（接收者角色），接收员工（请求者角色）的命令，并且是命令的真正执行者，从代码也可以看出，open()方法、close()方法
 * Receiver：接收者角色，该类是命令的具体执行者，负责具体实施或者执行一个请求，说的通俗一点，就是真正干活的角色
 */
public class CourseVideo {
    private String name;

    public CourseVideo(String name) {
        this.name = name;
    }

    public void open(){
        System.out.println(this.name+"-课程视频开放");
    }
    public void close(){
        System.out.println(this.name+"-课程视频关闭");
    }
}
