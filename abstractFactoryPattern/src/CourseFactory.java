/**
 * CourseFactory接口，课程工厂，相当于一个产品族的抽象工厂
 */
public interface CourseFactory {
    Video getVideo();
    Article getArticle();
}
