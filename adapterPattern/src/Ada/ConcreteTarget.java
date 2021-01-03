package Ada;

/**
 * ConcreteTarget类，具体目标类，实现了Target接口
 */
public class ConcreteTarget implements Target{
    @Override
    public void request() {
        System.out.println("concreteTarget目标方法");
    }
}
