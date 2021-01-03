/**
 * JavaArticle类，Java课程这个产品族中的Java手记，继承对应的产品等级结构Article类
 */

public class JavaArticle extends Article{
    @Override
    public void produce() {
        System.out.println("编写Java Video手记！");
    }
}
