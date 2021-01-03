/**
 * CourseVideoState类（状态角色），定义了每一个状态的行为接口，这些行为将会在Context中得以使用，从CourseVideoContext类代码也可以看出来
 * 状态（State）角色：状态角色定义了每一个状态的行为接口，这些行为将会在Context中得以使用
 */
public abstract class CourseVideoState {
    protected CourseVideoContext courseVideoContext;

    public void setCourseVideoContext(CourseVideoContext courseVideoContext) {
        this.courseVideoContext = courseVideoContext;
    }

    public abstract void play();
    public abstract void speed();
    public abstract void pause();
    public abstract void stop();
}
