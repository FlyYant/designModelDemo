/**
 * DesignPatternCourse类（设计模式课程类），
 * 继承了ACourse类，实现了自己的打包课程方法packageCourse() ，并且需要编写手记，使用钩子方法改变默认行为needWriteArticle()
 */
public class DesignPatternCourse extends ACourse{
    void packageCourse() {
        System.out.println("提供课程Java源代码");
    }

    @Override
    protected boolean needWriteArticle() {
        //需要编写手记
        return true;
    }
}
