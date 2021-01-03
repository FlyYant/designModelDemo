/**
 * Course类（课程类），继承了CatalogComponent类，并且重写了它需要的方法，是叶子节点（Leaf）
 */
public class Course extends CatalogComponent{
    private String name;
    private double price;

    public Course(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public double getPrice() {
        return this.price;
    }

    @Override
    public void print() {
        System.out.println("Course Name:"+name+" Price:"+price);
    }
}
