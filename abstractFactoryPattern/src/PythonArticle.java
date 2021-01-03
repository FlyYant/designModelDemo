/**
 * PythonArticle类，Python课程这个产品族中的Python手记，继承对应的产品等级结构Article类
 */

public class PythonArticle extends Article{
    @Override
    public void produce() {
        System.out.println("编写Python Video手记！");
    }
}
