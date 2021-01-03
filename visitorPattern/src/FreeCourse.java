/**
 * FreeCourse类（具体元素角色），免费课程类
 * 具体元素（ConcreteElement）角色 ：它提供接受访问方法的具体实现，而这个具体的实现，通常情况下是使用访问者提供的访问该元素类的方法
 */
public class FreeCourse extends Course{
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
