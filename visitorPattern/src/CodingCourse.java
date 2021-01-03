/**
 * CodingCourse类（具体元素角色），实战课程类，实战课程有一个价格属性
 */
public class CodingCourse extends Course{
    private int price;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
