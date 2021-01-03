/**
 * SpeedState类（具体状态角色），加速状态类，继承了CourseVideoState类，实现了对应的行为（根据上面说的规则）
 */
public class SpeedState extends CourseVideoState{
    public void play() {
        super.courseVideoContext.setCourseVideoState(CourseVideoContext.PLAY_STATE);
    }

    public void speed() {
        System.out.println("快进播放课程视频状态");
    }

    public void pause() {
        super.courseVideoContext.setCourseVideoState(CourseVideoContext.PAUSE_STATE);
    }

    public void stop() {
        super.courseVideoContext.setCourseVideoState(CourseVideoContext.STOP_STATE);
    }
}
