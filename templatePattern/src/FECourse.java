/**
 * FECourse类（前端课程），
 * 继承了ACourse类，实现了自己的打包课程方法packageCourse() ，并且不需要编写手记（ACourse类中默认行为）
 */
public class FECourse extends ACourse{
    void packageCourse() {
        System.out.println("提供课程的前端代码");
        System.out.println("提供课程的图片等多媒体素材");
    }
}
