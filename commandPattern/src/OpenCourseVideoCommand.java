/**
 * OpenCourseVideoCommand类（具体命令角色），打开课程视频命令类，实现了Command接口
 * ConcreteCommand：具体命令角色，该类实现了Command接口
 */
public class OpenCourseVideoCommand implements Command{
    private CourseVideo courseVideo;

    public OpenCourseVideoCommand(CourseVideo courseVideo) {
        this.courseVideo = courseVideo;
    }

    public void execute() {
        courseVideo.open();
    }
}
