/**
 * PlayState类（具体状态角色），播放状态类，继承了CourseVideoState类，实现了对应的行为（根据上面说的规则）
 * 具体状态（ConcreteState）角色：实现了相关行为的具体状态类
 */
public class PlayState extends CourseVideoState{
    public void play() {
        System.out.println("正常播放课程视频状态");
    }

    public void speed() {
        super.courseVideoContext.setCourseVideoState(CourseVideoContext.SPEED_STATE);
    }

    public void pause() {
        super.courseVideoContext.setCourseVideoState(CourseVideoContext.PAUSE_STATE);
    }

    public void stop() {
        super.courseVideoContext.setCourseVideoState(CourseVideoContext.STOP_STATE);
    }
}
