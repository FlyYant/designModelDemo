/**
 * IVisitor接口（访问者角色），定义了两个接口，用来访问两种不同类型的课程（免费课和实战课）。
 * 这里不符合依赖倒置原则，抽象层依赖了具体层，这是访问者模式的一个缺点
 * 访问者（Visitor）角色 ：接口或抽象类，它定义了对每一个元素(Element)访问的接口
 */
public interface IVisitor {
    void visit(FreeCourse freeCourse);
    void visit(CodingCourse codingCourse);
}
