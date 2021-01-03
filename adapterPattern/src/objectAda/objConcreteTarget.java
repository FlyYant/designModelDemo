package objectAda;

/**
 * ConcreteTarget类，具体目标类，实现了Target接口
 */
public class objConcreteTarget implements objTarget {
    @Override
    public void request() {
        System.out.println("objConcreteTarget目标方法");
    }
}
