/**
 * CloseCourseVideoCommand类（具体命令角色），关闭课程视频命令类，实现了Command接口
 */
public class CloseCourseVideoCommand implements Command{
    private CourseVideo courseVideo;

    public CloseCourseVideoCommand(CourseVideo courseVideo) {
        this.courseVideo = courseVideo;
    }

    public void execute() {
        courseVideo.close();
    }
}
