/**
 * Visitor类（具体访问者角色），实现了对每一个元素类访问时所产生的具体行为
 * 具体访问者（ConcreteVisitor）角色 ：具体的访问者，它需要实现对每一个元素类访问时所产生的具体行为
 */
public class Visitor implements IVisitor{
    public void visit(FreeCourse freeCourse) {
        System.out.println("免费课程："+freeCourse.getName());
    }

    public void visit(CodingCourse codingCourse) {
        System.out.println("实战课程："+codingCourse.getName()+" 价格："+codingCourse.getPrice());
    }
}
