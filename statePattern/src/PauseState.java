/**
 * PauseState类（具体状态角色），暂停状态类，继承了CourseVideoState类，实现了对应的行为（根据上面说的规则）
 */
public class PauseState extends CourseVideoState{
    public void play() {
        super.courseVideoContext.setCourseVideoState(CourseVideoContext.PLAY_STATE);
    }

    public void speed() {
        super.courseVideoContext.setCourseVideoState(CourseVideoContext.SPEED_STATE);
    }

    public void pause() {
        System.out.println("暂停播放课程视频状态");
    }

    public void stop() {
        super.courseVideoContext.setCourseVideoState(CourseVideoContext.STOP_STATE);
    }
}
