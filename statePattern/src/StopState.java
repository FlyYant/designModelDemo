/**
 * StopState类（具体状态角色），停止状态类，继承了CourseVideoState类，实现了对应的行为（根据上面说的规则）
 */
public class StopState extends CourseVideoState{
    public void play() {
        super.courseVideoContext.setCourseVideoState(CourseVideoContext.PLAY_STATE);
    }

    public void speed() {
        System.out.println("ERROR 停止状态不能快进");
    }

    public void pause() {
        System.out.println("ERROR 停止状态不能暂停");
    }

    public void stop() {
        System.out.println("停止播放课程视频状态");
    }
}
