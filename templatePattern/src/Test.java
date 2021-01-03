/**
 *
 */
public class Test {
    public static void main(String[] args) {
        System.out.println("后端设计模式课程start——");
        ACourse designPatternCourse = new DesignPatternCourse();
        designPatternCourse.makeCourse();
        System.out.println("后端设计模式课程end——");

        System.out.println("前端课程start——");
        ACourse fePatternCourse = new FECourse();
        fePatternCourse.makeCourse();
        System.out.println("前端课程end——");
    }
}
//从上面的代码例子中，我们可以发现，
// 在定义父类的模板方法的时候，我们将模板方法增加了final修饰，这样做的目的是为了子类对于父类的扩展原则是应该不修改父类原有的基本方法，
// 模板方法在定义上面就是来定义整个框架的，而这个设计也符合设计模式中的“开闭原则”-对扩展开放，对修改关闭，可选的方法，就可以使用钩子方法