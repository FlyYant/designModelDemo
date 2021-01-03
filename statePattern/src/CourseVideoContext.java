/**
 * CourseVideoContext类（环境角色），含有状态角色的对象courseVideoState
 * 环境（Context）角色：环境角色含有状态角色的对象，并且可以处理一些请求，这些请求最终产生的响应会与状态相关
 */
public class CourseVideoContext {
    private CourseVideoState courseVideoState;
    public final static PlayState PLAY_STATE = new PlayState();
    public final static SpeedState SPEED_STATE = new SpeedState();
    public final static PauseState PAUSE_STATE = new PauseState();
    public final static StopState STOP_STATE = new StopState();

    public CourseVideoState getCourseVideoState() {
        return courseVideoState;
    }

    public void setCourseVideoState(CourseVideoState courseVideoState) {
        this.courseVideoState = courseVideoState;
        this.courseVideoState.setCourseVideoContext(this);
    }

    public void play(){
        this.courseVideoState.play();
    }
    public void speed(){
        this.courseVideoState.speed();
    }
    public void pause(){
        this.courseVideoState.pause();
    }
    public void stop(){
        this.courseVideoState.stop();
    }
}
